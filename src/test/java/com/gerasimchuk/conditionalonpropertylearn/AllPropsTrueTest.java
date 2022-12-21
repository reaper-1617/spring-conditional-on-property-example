package com.gerasimchuk.conditionalonpropertylearn;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"x5.huawei.vkl=true", "x5.huawei.enable=true", "x5.huawei.enabled=true"})
class AllPropsTrueTest extends AbstractSpringBootTest {
}
