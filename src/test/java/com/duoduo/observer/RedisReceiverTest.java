package com.duoduo.observer;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lixiaolong
 * @create 2019-03-14 17:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RedisReceiverTest {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void test1(){
        for (int i = 0; i <1000 ; i++) {
            stringRedisTemplate.convertAndSend("index",String.valueOf(Math.random()));
        }

    }
}