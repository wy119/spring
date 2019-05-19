package test.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        Message message=new MessageImpl();
        message.update();

        Message proxy= (Message) Proxy.newProxyInstance(Message.class.getClassLoader(), Message.class.getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("...");
                return method.invoke(proxy,args);
            }
        });
        proxy.update();
    }

}
