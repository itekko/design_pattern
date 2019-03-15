package com.duoduo.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DesignPatternApplicationTests {

    @Autowired
    private DeviceStrategeyConfig deviceStrategeyConfig;
    @Test
    public void contextLoads() {
        deviceStrategeyConfig.getDeviceStrategey(1).uploadData();
        deviceStrategeyConfig.getDeviceStrategey(2).uploadData();
        deviceStrategeyConfig.getDeviceStrategey(3).uploadData();

        /**
         * 当然也可以自定义实现设备策略方式
         */
        DeviceStrategey deviceStrategey = new DeviceStrategey() {
            @Override
            public void uploadData() {
                log.info("自定义方式上传数据");
            }

            @Override
            public void remoteOpenDoor() {
                log.info("自定义方式远程开门");
            }
        };

        deviceStrategey.uploadData();
    }

}
