package org.terror.codeplaygroundspring.dtoTest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
// 내가 수정한거
public class ComputerDto {

    @Getter
    @Builder
    @AllArgsConstructor
    public static class MicroComputer {
        private Long id;
        private String name;
        private String micro;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    public static class MiniComputer {
        private Long id;
        private String name;
        private String mini;
    }
}
