package org.terror.codeplaygroundspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.terror.codeplaygroundspring.applicationProfile.ProfileChecker;

@SpringBootTest
public class TestClass {
    @Autowired
    ProfileChecker profileChecker;
    @Test
    void test(){
        String profile = profileChecker.checkActiveProfile();
        if (profile.equals("local")) System.out.println("local 에서 시험 중입니다");
        else if (profile.equals("production")) System.out.println("production 에서 시험 중입니다");
    }
}
