package com.duoduo.observer02;

import com.duoduo.model.ChatObject;

/**
 * 说明：处理一个项目数据生成报表，并保存fastDFS中
 * @author lixiaolong
 * @create 2019-03-15 15:51
 */
public interface ReportStrategy {

    void dealData(ChatObject chatObject);
}
