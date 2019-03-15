package com.duoduo.observer02;

import com.duoduo.strategy.AlibabaDeviceStrategey;
import com.duoduo.strategy.AphoneDeviceStrategey;
import com.duoduo.strategy.DeviceStrategey;
import com.duoduo.strategy.G5DeviceStrategey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lixiaolong
 * @create 2019-03-12 20:01
 */
@Component
public class ReportStrategeyConfig {

    private static final Map<Integer,Class> map = new ConcurrentHashMap<>();


    @Autowired
    private ApplicationContext applicationContext;
    /**
     * 初始化映射关系Map,key-设备类型，1：火力报表；2：水力报表；3：网关报表
     *                 value-各类报表的实现类
     * 映射关系可以从数据库中读取、或者配置文件中读取
     */
    static {
        map.put(1,FireReportStrategy.class);
        map.put(2,WaterReportStrategy.class);
        map.put(3,GatewayReportStrategy.class);
    }

    public ReportStrategy getDeviceStrategey(Integer type){
        return (ReportStrategy)applicationContext.getBean(map.get(type));
    }


}
