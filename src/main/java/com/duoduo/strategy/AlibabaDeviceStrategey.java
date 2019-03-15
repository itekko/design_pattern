package com.duoduo.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lixiaolong
 * @create 2019-03-12 19:24
 */
@Slf4j
@Service
public class AlibabaDeviceStrategey implements DeviceStrategey {


    @Override
    public void uploadData() {
        // 业务逻辑
        log.info("阿里巴巴设备上传数据");
    }

    @Override
    public void remoteOpenDoor() {
        // 业务逻辑
        log.info("阿里巴巴设备远程开门");
    }
}
