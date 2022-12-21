package com.gerasimchuk.conditionalonpropertylearn.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(value = "x5.huawei.vkl")
    public HuaweiApp huaweiApp1(){
        return new HuaweiApp("bean conditional on vkl prop");
    }

    @Bean
    @ConditionalOnProperty(value = "x5.huawei.enable")
    public HuaweiApp huaweiApp2(){
        return new HuaweiApp("bean conditional on enable prop");
    }

    @Bean
    @ConditionalOnProperty(value = "x5.huawei.enabled")
    public HuaweiApp huaweiApp3(){
        return new HuaweiApp("bean conditional on enabled prop");
    }

    @Data
    public static class HuaweiApp{
        private final String text;
    }

}
