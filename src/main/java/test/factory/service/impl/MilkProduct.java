package test.factory.service.impl;
import test.factory.service.Product;

/**
 * 牛奶工厂
 * @author:wy
 * @Date: 2019/5/18 17:36
 */
public class MilkProduct implements Product {

    public MilkProduct(){

        System.out.println("生产了一瓶牛奶");
    }

    @Override
    public void showProduct() {

        System.out.println("我是一瓶牛奶");
    }

}
