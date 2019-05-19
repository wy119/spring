package test.factory;
import test.factory.service.Factory;
import test.factory.service.Product;
import test.factory.service.impl.CarProduct;
import test.factory.service.impl.MilkFatory;
import test.factory.service.impl.MilkProduct;

public class Test {


    public static void main(String[] args) {

        CarProduct carProduct=new CarProduct();
        MilkProduct milkProduct=new MilkProduct();

        // 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
        Factory factory=(Factory)new MilkFatory();

        Product product=factory.newProduct();
    }
    
}
