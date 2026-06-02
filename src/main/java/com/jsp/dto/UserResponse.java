package com.jsp.dto;


import lombok.Data;

@Data
public class UserResponse {
    private Integer user_id;
    private String name;
    private String email;
    private Long phone;
}
