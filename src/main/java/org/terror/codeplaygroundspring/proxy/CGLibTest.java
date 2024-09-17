package org.terror.codeplaygroundspring.proxy;

import net.sf.cglib.proxy.Enhancer;

public class CGLibTest {
    public static void main(String[] args) {
        Enhancer rabbitEnhancer = new Enhancer();
        rabbitEnhancer.setSuperclass(Rabbit.class);
        rabbitEnhancer.setCallback(new AnimalProxyHandler(new Rabbit()));
        Rabbit rabbit = (Rabbit) rabbitEnhancer.create();
        rabbit.eat();
    }
}
