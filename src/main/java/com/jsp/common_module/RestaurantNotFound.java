package com.jsp.common_module;

public class RestaurantNotFound extends RuntimeException{
    public RestaurantNotFound(String message) {
        super(message);
    }
}
