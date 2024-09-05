package org.terror.codeplaygroundspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("/{memberId}")
    public void getMemberId(@PathVariable int memberId) {
        System.out.println(memberId);
    }

    @GetMapping("/{calendarId}")
    public void getCalendarId(@PathVariable int calendarId) {
        System.out.println(calendarId);
    }
}
