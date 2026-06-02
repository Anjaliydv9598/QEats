package com.jsp.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

    private Integer user_id;
    private String email;
    private String name;
    private Long phone;
}
