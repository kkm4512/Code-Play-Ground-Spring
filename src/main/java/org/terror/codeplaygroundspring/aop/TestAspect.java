package org.terror.codeplaygroundspring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class TestAspect {
    @Pointcut("@annotation(org.terror.codeplaygroundspring.annotation.PrintLog)")
    public void callAt() {

    };

    @Around("callAt()")
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
        String name = pjp.getSignature().toShortString();
        System.out.println(":: " + name + " around log 실행 ::");
        Object result = pjp.proceed();
        System.out.println(":: " + name + " around log 끝 ::");
        return result;
    }
}
