package test.dapter;

//对象适配器类,
public class ObjectAdapter implements TargetUsb {

    private AdapteePs2 ps2;

    public ObjectAdapter(AdapteePs2 ps2) {

        this.ps2 = ps2;
    }

    public void useUsb() {

        ps2.usePs2();
    }

}
