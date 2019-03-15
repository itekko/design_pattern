package com.duoduo.strategy;

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
public class DeviceStrategeyConfig {

    private static final Map<Integer,Class> map = new ConcurrentHashMap<>();


    @Autowired
    private ApplicationContext applicationContext;
    /**
     * 初始化映射关系Map,key-设备类型，1：阿里巴巴设备；2：G5设备；3：Aphone设备
     *                 value-各类设备的实现类
     * 映射关系可以从数据库中读取、或者配置文件中读取
     */
    static {
        map.put(1,AlibabaDeviceStrategey.class);
        map.put(2,G5DeviceStrategey.class);
        map.put(3,AphoneDeviceStrategey.class);
    }

    public DeviceStrategey getDeviceStrategey(Integer type){
        return (DeviceStrategey)applicationContext.getBean(map.get(type));
    }


}
