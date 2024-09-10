package org.terror.codeplaygroundspring.dtoTest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DtoTestController {
    private final DtoTestService dtoTestService;

    @PostMapping("/computers")
    public ComputerDto.MicroComputer getComputer(@RequestBody ComputerDto.MicroComputer computerDto) {
        return dtoTestService.getComputerInfo(computerDto);
    }
}
