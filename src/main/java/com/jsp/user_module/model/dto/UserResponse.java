package com.jsp.user_module.model.dto;


import lombok.Data;

@Data
public class UserResponse {
    private Integer user_id;
    private String name;
    private String email;
    private Long phone;
}
