package org.terror.codeplaygroundspring;

import net.sf.cglib.proxy.Enhancer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.terror.codeplaygroundspring.proxy.PrintLogInterceptor;
import org.terror.codeplaygroundspring.proxy.Rabbit;

public class MethodInterceptorTest {
    @Test
    @DisplayName("메서드 인터셉터를 활용한 CGLib Proxy 테스트")
    public void test1(){
        //Enhancer 객체를 생성
        Enhancer rabbitEnhancer = new Enhancer();
        // setSuperclass() 메소드에 프록시할 클래스 지정
        rabbitEnhancer.setSuperclass(Rabbit.class);
        // 로그 출력해주는 인터셉터 지정
        rabbitEnhancer.setCallback(new PrintLogInterceptor());
        Rabbit rabbit = (Rabbit) rabbitEnhancer.create(); // 프록시 생성

        rabbit.eat();
    }
}
