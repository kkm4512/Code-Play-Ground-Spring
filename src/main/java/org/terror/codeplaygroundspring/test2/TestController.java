package org.terror.codeplaygroundspring.test2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api")
    public void exceptionTest(){
        throw new ChildBadException(BaseResponseBody.SUCCESS);
    }
}
