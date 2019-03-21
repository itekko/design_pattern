package com.duoduo.decorator.impl;

import com.duoduo.decorator.CouponService;
import com.duoduo.decorator.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @author lixiaolong
 * @create 2019-03-21 11:26
 */
@Service
public class CouponServiceImpl implements CouponService {

    private GoodsService goodsService;

    @Override
    public Double couponCost() {
        //伪代码 计算优惠券价格为666.0
        return 666.0;
    }

    @Override
    public Double cost() {
        return goodsService.cost() - couponCost();
    }

    @Override
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }
}
