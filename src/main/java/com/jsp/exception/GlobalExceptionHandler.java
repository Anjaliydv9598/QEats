package com.jsp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
