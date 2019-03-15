package com.duoduo.observer02;

import com.duoduo.model.ChatObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author lixiaolong
 * @create 2019-03-15 15:48
 */
@Component
public class ReportListener {

    @Autowired
    private ReportStrategeyConfig reportStrategeyConfig;

    /**
     * 执行火力报表
     * @param reportEvent
     */
    //@Order(1)
    @EventListener
    @Async
    public void fireReportListener(ReportEvent reportEvent){
        ChatObject chatObject = reportEvent.getChatObject();
        reportStrategeyConfig.getDeviceStrategey(1).dealData(chatObject);

    }

    /**
     * 执行水力报表
     * @param reportEvent
     */
    //@Order(7)
    @EventListener
    @Async
    public void waterReportListener(ReportEvent reportEvent){
        ChatObject chatObject = reportEvent.getChatObject();
        reportStrategeyConfig.getDeviceStrategey(2).dealData(chatObject);

    }

    /**
     * 执行网关报表
     * @param reportEvent
     */
    //@Order(3)
    @EventListener
    @Async
    public void gatewayReportListener(ReportEvent reportEvent){
        ChatObject chatObject = reportEvent.getChatObject();
        reportStrategeyConfig.getDeviceStrategey(3).dealData(chatObject);

    }
}
