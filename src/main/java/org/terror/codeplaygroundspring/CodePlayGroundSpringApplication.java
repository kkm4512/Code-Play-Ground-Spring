package org.terror.codeplaygroundspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class CodePlayGroundSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodePlayGroundSpringApplication.class, args);
    }
}
