package org.terror.codeplaygroundspring.responseApI;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BaseResponse {
    private final HttpStatus status;
    private final String message;
    private final Object[] datas;

    public BaseResponse(ResponseStatus responseStatus, Object[] datas) {
        this.status = responseStatus.getStatus();
        this.message = responseStatus.getMsg();
        this.datas = datas;
    }
}
