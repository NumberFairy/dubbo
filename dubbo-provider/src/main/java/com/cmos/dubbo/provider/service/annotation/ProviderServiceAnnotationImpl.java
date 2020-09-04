package com.cmos.dubbo.provider.service.annotation;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * TODO 注解方式  实现类
 *
 * @AUTHOR ZhaoChengcai
 * @DATE 2020/9/2
 */
// @Service 用来配置Dubbo服务提供方
@Service(timeout = 5000)
public class ProviderServiceAnnotationImpl implements ProviderServiceAnnotation{
    public String sayHelloWorld(String name) {
        return name;
    }
}
