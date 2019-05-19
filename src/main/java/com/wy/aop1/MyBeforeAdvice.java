package com.wy.aop1;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
/**
 * 前置增强
 * @author:wy
 * @Date: 2019/5/19 1:07
 */
public class MyBeforeAdvice implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {

        System.out.println("前置增强+++");
    }

}
