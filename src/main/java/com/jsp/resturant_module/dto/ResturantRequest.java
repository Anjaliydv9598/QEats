package com.jsp.resturant_module.dto;

import lombok.Data;

public class ResturantRequest {

    @Data
    private String resturantName;
    private Long phone;
    private String address;
    private Integer pincode;
}
