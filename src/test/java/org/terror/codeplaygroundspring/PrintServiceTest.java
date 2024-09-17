package org.terror.codeplaygroundspring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.terror.codeplaygroundspring.testService.TestServiceImpl;

@SpringBootTest
public class PrintServiceTest {
    @Autowired
    TestServiceImpl testService;

    @Test
    @DisplayName("런타임 위빙 테스트 하기")
    void test1(){
        System.out.println(testService.getClass());
    }
}
