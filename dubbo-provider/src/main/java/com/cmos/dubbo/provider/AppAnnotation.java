package com.cmos.dubbo.provider;

import com.cmos.dubbo.provider.configuration.DubboConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO
 *
 * @AUTHOR ZhaoChengcai
 * @DATE 2020/9/2
 */
public class AppAnnotation {
    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DubboConfiguration.class);
        configApplicationContext.start();
        System.in.read();
    }
}
