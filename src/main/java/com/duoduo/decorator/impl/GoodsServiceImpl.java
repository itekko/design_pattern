package com.duoduo.decorator.impl;

import com.duoduo.decorator.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @author lixiaolong
 * @create 2019-03-21 11:26
 */
@Service
public class GoodsServiceImpl implements GoodsService {


    @Override
    public Double cost() {
        //伪代码 计算出商品价格为18888.9
        return 18888.9;
    }
}
