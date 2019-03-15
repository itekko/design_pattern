package com.duoduo.observer;

import com.corundumstudio.socketio.*;
import com.corundumstudio.socketio.listener.DataListener;
import com.duoduo.model.ChatObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author lixiaolong
 * @company 深圳和而泰智能控制股份有限公司
 * @create 2019-03-15 8:53
 */
@Configuration
@Slf4j
public class SocketIOConfig {


    @Bean(initMethod = "start",destroyMethod = "stop")
    //@Primary
    SocketIOServer getSocketServer01(){
        com.corundumstudio.socketio.Configuration config = new com.corundumstudio.socketio.Configuration();
        config.setHostname("localhost");
        config.setPort(9092);

        SocketIOServer server = new SocketIOServer(config);
        server.addEventListener("ackevent1", ChatObject.class, new DataListener<ChatObject>() {
            @Override
            public void onData(final SocketIOClient client, ChatObject data, final AckRequest ackRequest) {

                // check is ack requested by client,
                // but it's not required check
                if (ackRequest.isAckRequested()) {
                    // send ack response with data to client
                    ackRequest.sendAckData("client message was delivered to server!", "yeah!");
                }
                log.info("客户端消息{}",data);
            }
        });
        return server;
    }







}
