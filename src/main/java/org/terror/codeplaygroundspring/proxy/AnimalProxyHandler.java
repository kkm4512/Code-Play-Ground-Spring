package org.terror.codeplaygroundspring.proxy;

import net.sf.cglib.proxy.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalProxyHandler implements InvocationHandler {
    Object target;

    public AnimalProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = null;
        System.out.println("::: BEFORE :::");
        if (method.getName().equals("eat")) {
            System.out.println("::: EAT 메서드 호출 :::");
            result = method.invoke(target, objects);
            System.out.println("::: EAT 메서드 호출 끝 :::");
        }
        return result;
    }
}
