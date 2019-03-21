package com.duoduo.decorator;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lixiaolong
 * @create 2019-03-21 11:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DecoratorTest {



    @Autowired
    private CouponService couponService;

    @Qualifier("goodsServiceImpl")
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private ActivtyService activtyService;
    @Test
    public void contextLoads() {

        activtyService.setGoodsService(goodsService);
        couponService.setGoodsService(activtyService);
        Double cost = couponService.cost();
        //18888.9 - 1000 - 666 = 17222.9
        log.info("最终价格为:{}",cost);


    }

}