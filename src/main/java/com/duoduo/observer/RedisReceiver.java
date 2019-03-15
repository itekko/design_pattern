package com.duoduo.observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lixiaolong
 * @company 深圳和而泰智能控制股份有限公司
 * @create 2019-03-14 16:59
 */
@Slf4j
@Service
public class RedisReceiver {

    public void receiveMessage(String message) {
        log.info("消息来了："+message);
    }
}
