package com.cmos.dubbo.provider.configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO 组装服务提供方   -- 注解方式配置
 *
 * @AUTHOR ZhaoChengcai
 * @DATE 2020/9/2
 */
// 通过@EnableDubbo指定在com.cmos.dubbo.provider.service.annotation包下扫描所有标注有@Service的类
// 通过@Configuration注解将 DubboConfiguration类中所有的@Bean通过java config 的方式组装出来并注入给Dubbo服务（也就是标有@Service的类）
@Configuration
@EnableDubbo(scanBasePackages = "com.cmos.dubbo.provider.service.annotation")
public class DubboConfiguration {

    // 1. 服务提供者信息配置
    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(1000);
        return providerConfig;
    }

    // 2. 分布式应用信息配置
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-annotation-provider");
        return applicationConfig;
    }

    // 3. 注册中心信息配置
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("localhost");
        registryConfig.setPort(2181);
        return registryConfig;
    }

    // 4. 使用协议配置，这里使用dubbo
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }
}
