package test.factory.service.impl;
import test.factory.service.Product;

/**
 *  汽车产品
 * @author:wy
 * @Date: 2019/5/18 17:25
 */
public class CarProduct implements Product {

    public CarProduct(){

        System.out.println("生产了一辆小汽车 ");
    }
    @Override
    public void showProduct() {

        System.out.println("我是一辆小汽车");
    }

}
