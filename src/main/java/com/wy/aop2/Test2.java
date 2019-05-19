package com.wy.aop2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class Test2 {

    @Autowired
    @Qualifier("proxy")
    private MessageService messageService;

    @Test
    public void test(){

        messageService.update();
        messageService.delete();
    }

}
