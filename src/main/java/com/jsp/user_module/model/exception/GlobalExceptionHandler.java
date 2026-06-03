package com.jsp.user_module.model.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ErrorResponseStructure HandleUserException(UserException e) {
        ErrorResponseStructure error = new ErrorResponseStructure();

        error.setMessage(e.getMessage());
        error.setCode(404);

        return  error;
    }
}
