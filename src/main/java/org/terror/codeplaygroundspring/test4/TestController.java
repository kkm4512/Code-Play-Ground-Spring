package org.terror.codeplaygroundspring.test4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/{memberId}")
    public void printMemberId(@PathVariable String memberId) {
        System.out.println(memberId);
    }

    @GetMapping("/{calendarId}")
    public void printCalendarIdId(@PathVariable String calendarId) {
        System.out.println(calendarId);
    }
}
