package com.wy.aop3;
import com.wy.aop2.MessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 根据名称自动生产代理
 * @author:wy
 * @Date: 2019/5/19 1:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationConfig3.xml")
public class Test3 {

    @Autowired
    @Qualifier("messageService")
    private MessageService messageService;

    @Test
    public void test(){

        messageService.update();
        messageService.delete();

    }

}
