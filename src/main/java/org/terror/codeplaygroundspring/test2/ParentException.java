package org.terror.codeplaygroundspring.test2;

import lombok.Getter;

@Getter
public class ParentException extends RuntimeException {
    private final BaseResponseBody body;
    public ParentException(BaseResponseBody body) {
        this.body = body;
    }
}
