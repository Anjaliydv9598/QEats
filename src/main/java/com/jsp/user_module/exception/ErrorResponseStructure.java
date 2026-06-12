package com.jsp.user_module.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponseStructure {
    private Integer code;
    private String message;
}
