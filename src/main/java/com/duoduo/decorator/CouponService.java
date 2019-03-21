package com.duoduo.decorator;

/**
 * @author lixiaolong
 * @create 2019-03-21 11:21
 */
public interface CouponService extends GoodsService{

    Double couponCost();

    void setGoodsService(GoodsService goodsService);

}
