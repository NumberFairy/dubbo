package com.cmos.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @AUTHOR ZhaoChengcai
 * @DATE 2020/9/1
 */
public class App {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read();
    }
}
