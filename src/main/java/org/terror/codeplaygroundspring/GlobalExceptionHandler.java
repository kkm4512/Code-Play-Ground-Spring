package org.terror.codeplaygroundspring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.terror.codeplaygroundspring.test2.BaseResponse;
import org.terror.codeplaygroundspring.test2.ParentException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ParentException.class)
    public ResponseEntity<BaseResponse> parentException(ParentException e) {
        return new ResponseEntity<>(new BaseResponse(e.getBody()), e.getBody().getStatus());
    }
}
