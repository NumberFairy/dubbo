package com.cmos.dubbo.consumer;

import com.cmos.dubbo.consumer.annotation.ConsumerAnnotationService;
import com.cmos.dubbo.consumer.configuration.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * TODO
 *
 * @AUTHOR ZhaoChengcai
 * @DATE 2020/9/2
 */
public class AppAnnotation {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        ConsumerAnnotationService consumerAnnotationService = context.getBean(ConsumerAnnotationService.class);
        String str = consumerAnnotationService.doSayHelloWorld("hello, world");
        System.out.println(str);
    }

}
