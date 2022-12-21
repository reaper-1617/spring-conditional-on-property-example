package com.gerasimchuk.conditionalonpropertylearn;

import com.gerasimchuk.conditionalonpropertylearn.config.Config;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import java.util.Map;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class ConditionalOnPropertyLearnApplication {
//
//    private final ApplicationContext ctx;
//
//    @Value("${x5.huawei.vkl}")
//    private String x5huaweiVkl;
//
//    @Value("${x5.huawei.enable}")
//    private String x5huaweiEnable;
//
//    @Value("${x5.huawei.enabled}")
//    private String x5huaweiEnabled;

    public static void main(String[] args) {
        SpringApplication.run(ConditionalOnPropertyLearnApplication.class, args);
    }

//    @EventListener(ContextRefreshedEvent.class)
//    public void onContextRefreshed() {
//        log.info("'vkl' param value: {}", x5huaweiVkl);
//        log.info("'enable' param value: {}", x5huaweiEnable);
//        log.info("'enabled' param value: {}", x5huaweiEnabled);
//        Map<String, Config.HuaweiApp> beans = ctx.getBeansOfType(Config.HuaweiApp.class);
//        log.info("Beans: {}", beans);
//    }

}
