package com.cmos.dubbo.consumer;

import com.cmos.dubbo.provider.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @AUTHOR ZhaoChengcai
 * @DATE 2020/9/1
 */
public class AppConsumer {
    public static void main(String[] args)  throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        ProviderService providerService = (ProviderService)context.getBean("providerService");
        String str = providerService.sayHello("xiaoming");
        System.out.println(str);
        System.in.read();
    }

}
