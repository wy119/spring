package test.factory.service.impl;
import test.factory.service.Factory;
import test.factory.service.Product;

public class MilkFatory implements Factory {

    @Override
    public Product newProduct() {

        return new MilkProduct();
    }

}
