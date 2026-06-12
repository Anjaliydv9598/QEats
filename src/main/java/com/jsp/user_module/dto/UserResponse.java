package com.jsp.user_module.dto;


import com.jsp.user_module.model.User;
import lombok.Data;

@Data
public class UserResponse {
    private Integer id;
    private String name;
    private String email;
    private Long phone;

    public UserResponse(User user ) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.phone = user.getPhone();
    }
}
