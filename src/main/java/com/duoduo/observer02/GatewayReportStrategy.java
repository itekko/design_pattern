package com.duoduo.observer02;

import com.duoduo.model.ChatObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 网关报表实现类
 * @author lixiaolong
 * @create 2019-03-15 15:54
 */
@Service
@Slf4j
public class GatewayReportStrategy implements ReportStrategy {
    
    
    @Override
    public void dealData(ChatObject chatObject) {
        /**
         * 1.生成pdf报表文件，上传FastDFS文件服务器上
         * 2.更新数据。。。。
         * 等等业务
         */
        log.info("生成网关报表:{}",chatObject);
        
    }
}
