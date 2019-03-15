package com.duoduo.observer02;

import com.duoduo.model.ChatObject;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 火力报表
 * @author lixiaolong
 * @create 2019-03-15 15:35
 */
@Getter
public class ReportEvent extends ApplicationEvent {

    private ChatObject chatObject;

    public ReportEvent(Object source, ChatObject chatObject) {
        super(source);
        this.chatObject = chatObject;
    }
}
