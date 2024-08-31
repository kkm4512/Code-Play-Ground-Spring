package org.terror.codeplaygroundspring.test2;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum BaseResponseBody {
    SUCCESS(true, HttpStatus.OK,"요청에 성공 하였습니다"),
    FAIL(false,HttpStatus.BAD_REQUEST, "요청에 실패 하였습니다"),
    ;
    private final boolean isSuccess;
    private final HttpStatus status;
    private final String message;

    BaseResponseBody(boolean isSuccess, HttpStatus status, String message) {
        this.isSuccess = isSuccess;
        this.status = status;
        this.message = message;
    }
}
