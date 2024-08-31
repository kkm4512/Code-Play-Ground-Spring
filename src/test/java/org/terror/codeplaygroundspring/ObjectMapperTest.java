package org.terror.codeplaygroundspring;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.terror.codeplaygroundspring.test3.User;

import java.io.File;
import java.io.IOException;

@SpringBootTest
public class ObjectMapperTest {

    @Test
    void test() throws IOException {
        ObjectMapper om = new ObjectMapper();
        User user = new User("test1", 10);
        om.writeValue(new File("user.json"), user);
        System.out.println(om.readValue(new File("user.json"), User.class));
    }
}
