package com.duoduo.decorator.impl;

import com.duoduo.decorator.ActivtyService;
import com.duoduo.decorator.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @author lixiaolong
 * @create 2019-03-21 11:26
 */
@Service
public class ActivtyServiceImpl implements ActivtyService {


    private GoodsService goodsService;

    @Override
    public Double activtyCost() {
        //伪代码 计算活动优惠价格为1000.0
        return 1000.0;
    }

    @Override
    public Double cost() {
        return goodsService.cost() - activtyCost();
    }

    @Override
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
}
