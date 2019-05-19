package test.proxy;
import org.junit.Test;

public class MessageImpl implements Message{

    @Test
    public void update(){

        System.out.println("修改消息");
    }

    public void delete(){

        System.out.println("删除消息");
    }
}
