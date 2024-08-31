package org.terror.codeplaygroundspring.test2;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseResponse {
    private final boolean isSuccess;
    private final HttpStatus status;
    private final String message;

    public BaseResponse(BaseResponseBody body) {
        this.isSuccess = body.isSuccess();
        this.status = body.getStatus();
        this.message = body.getMessage();
    }
}
