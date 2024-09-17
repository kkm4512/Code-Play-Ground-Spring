package org.terror.codeplaygroundspring;

import net.sf.cglib.proxy.Enhancer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.terror.codeplaygroundspring.proxy.AnimalProxyHandler;
import org.terror.codeplaygroundspring.proxy.Rabbit;

public class CGLibTest {
    @Test
    @DisplayName("CGLib을 활용한 프록시 객체로 InvocationHandler 활용해보기")
    public void test1() {
        Enhancer rabbitEnhancer = new Enhancer();
        rabbitEnhancer.setSuperclass(Rabbit.class);
        rabbitEnhancer.setCallback(new AnimalProxyHandler(new Rabbit()));
        Rabbit rabbit = (Rabbit) rabbitEnhancer.create();
        rabbit.eat();
    }
}
