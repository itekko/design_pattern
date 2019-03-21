package com.duoduo.decorator;

/**
 * @author lixiaolong
 * @create 2019-03-21 11:21
 */
public interface ActivtyService extends GoodsService{

    Double activtyCost();

    void setGoodsService(GoodsService goodsService);
}
