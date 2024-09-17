package org.terror.codeplaygroundspring.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class PrintLogInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        System.out.println("::: BEFORE :::");
        result = methodProxy.invokeSuper(o, objects);
        System.out.println("::: AFTER :::");
        return result;
    }
}
