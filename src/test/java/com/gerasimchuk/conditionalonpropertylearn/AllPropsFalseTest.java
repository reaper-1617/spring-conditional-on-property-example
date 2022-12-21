package com.gerasimchuk.conditionalonpropertylearn;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"x5.huawei.vkl=false", "x5.huawei.enable=false", "x5.huawei.enabled=false"})
class AllPropsFalseTest extends AbstractSpringBootTest {
}
