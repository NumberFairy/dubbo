package com.cmos.dubbo.consumer.annotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cmos.dubbo.provider.service.annotation.ProviderServiceAnnotation;
import org.springframework.stereotype.Component;

/**
 * TODO  注解方式的service
 *
 * @AUTHOR ZhaoChengcai
 * @DATE 2020/9/2
 */
@Component("annotationConsumer")
public class ConsumerAnnotationService {

    //在ConsumerAnnotationService类中，通过@Reference引用服务端提供的类，然后通过方法调用这个类的方式，给消费端提供接口
    @Reference
    private ProviderServiceAnnotation providerServiceAnnotation;

    public String doSayHelloWorld(String name){
        return providerServiceAnnotation.sayHelloWorld(name);
    }
}
