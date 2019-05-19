package com.wy.aop2;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕增强
 *
 * @author:wy
 * @Date: 2019/5/19 1:06
 */
public class MyAroundAdvice implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("前置增强------");

        Object result=invocation.proceed();

        System.out.println("后置增强------\n");

        return result;
    }

}
