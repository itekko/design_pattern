package com.duoduo.observer02;


import com.duoduo.model.ChatObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lixiaolong
 * @create 2019-03-15 16:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ReportEventTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        ChatObject chatObject = new ChatObject("ekko", "hello world");
        applicationContext.publishEvent(new ReportEvent(this,chatObject));
    }

}