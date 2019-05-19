package com.wy.aop1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationConfig1.xml")
public class Test1 {

    @Autowired
    @Qualifier("proxy")
    private MessageService messageService;

    @Test
    public void test(){

        messageService.update();
        messageService.delete();
    }

}
