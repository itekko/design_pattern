package com.duoduo.controller;

import com.corundumstudio.socketio.AckCallback;
import com.corundumstudio.socketio.SocketIOServer;
import com.duoduo.model.ChatObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lixiaolong
 * @company 深圳和而泰智能控制股份有限公司
 * @create 2019-03-15 11:24
 */
@Controller
@Slf4j
public class SenderMessageController {

    @Autowired
    private SocketIOServer socketIOServer;

    @GetMapping("/sendMessage")
    public void sendMessage(){
        ChatObject chatObject = new ChatObject("小龙","人生何处不相逢");
        socketIOServer.getBroadcastOperations().sendEvent("chatevent", chatObject);
    }

}
