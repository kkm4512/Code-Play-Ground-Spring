package org.terror.codeplaygroundspring.test2;

public class ChildBadException extends ParentException {
    public ChildBadException(BaseResponseBody body) {
        super(body);
    }
}
