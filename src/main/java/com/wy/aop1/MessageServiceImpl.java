package com.wy.aop1;
public class MessageServiceImpl implements MessageService {

    @Override
    public void update() {

        System.out.println("修改消息。。。");
    }

    @Override
    public void delete() {

        System.out.println("删除消息。。。");
    }

}
