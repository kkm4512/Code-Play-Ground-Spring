package org.terror.codeplaygroundspring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.terror.codeplaygroundspring.entity.EnvTestEntity;
import org.terror.codeplaygroundspring.repository.EnvTestRepository;

@RestController
@RequiredArgsConstructor
public class EnvTestController {
    private final EnvTestRepository etr;
    @GetMapping
    public void EnvTest(){
        EnvTestEntity ete = new EnvTestEntity();
        etr.save(ete);
    }
}
