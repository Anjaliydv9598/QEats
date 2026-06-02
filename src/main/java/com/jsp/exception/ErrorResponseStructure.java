package com.jsp.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponseStructure {
    private Integer code;
    private String message;
}
