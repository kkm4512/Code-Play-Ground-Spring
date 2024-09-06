package org.terror.codeplaygroundspring.responseApI;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ResponseStatus {
    SUCCESS(HttpStatus.OK,"성공 하였습니다!"),
    FAIL(HttpStatus.BAD_REQUEST,"실패 하였습니다..");

    private final HttpStatus status;
    private final String msg;

    ResponseStatus(HttpStatus status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
