package com.kevin.行为型模式.策略模式.strategy;

/**
 * @author kevin
 * @version 1.0
 * @description     具体策略角色，老客户，小批量
 * @createDate 2019/3/4
 */
public class OldCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standarPrice) {
        System.out.println("打八五折");
        return standarPrice*0.85;
    }
}
