package test.dapter;
public class User {

    //客户端代码
    public static void main(String[] args) {

        System.out.println("对象适配器模式测试：");

        AdapteePs2 ps2 = new AdapteePs2();
        TargetUsb usb = new ObjectAdapter(ps2);

        // 通过适配器转换，usb接口也可以匹配ps2接口
        usb.useUsb();
    }

}
