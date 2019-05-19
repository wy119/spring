package test.factory.service.impl;
import test.factory.service.Factory;
import test.factory.service.Product;

/**
 *  汽车工厂
 * @description:
 * @author:wy
 * @Date: 2019/5/18 17:18
 */
public class CarFactory implements Factory {


    @Override
    public Product newProduct() {

        return new CarProduct();
    }

}
