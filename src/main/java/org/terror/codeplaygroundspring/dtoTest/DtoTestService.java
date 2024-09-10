package org.terror.codeplaygroundspring.dtoTest;

import org.springframework.stereotype.Service;

@Service
public class DtoTestService {
    public ComputerDto.MicroComputer getComputerInfo(ComputerDto.MicroComputer computerDto) {
        return computerDto;
    }
}
