package com.gerasimchuk.conditionalonpropertylearn;

import com.gerasimchuk.conditionalonpropertylearn.config.Config;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@Slf4j
@RequiredArgsConstructor
public abstract class AbstractSpringBootTest {

    protected ApplicationContext ctx;
    @Value("${x5.huawei.vkl}")
    private String x5huaweiVkl;
    @Value("${x5.huawei.enable}")
    private String x5huaweiEnable;
    @Value("${x5.huawei.enabled}")
    private String x5huaweiEnabled;

    @Autowired
    public void setCtx(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Test
    protected void runTest(){
        print();
    }

    protected void print() {
        log.info("'vkl' param value: {}", x5huaweiVkl);
        log.info("'enable' param value: {}", x5huaweiEnable);
        log.info("'enabled' param value: {}", x5huaweiEnabled);
        Map<String, Config.HuaweiApp> beans = ctx.getBeansOfType(Config.HuaweiApp.class);
        log.info("Beans: {}", beans);
    }
}
