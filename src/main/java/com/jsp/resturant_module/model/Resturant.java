package com.jsp.resturant_module.model;


import com.jsp.user_module.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Resturant {

    @Id
    private Long resturantId;
    private String resturantName;
    private Long phone;
    private String address;
    private Integer pincode;
    private String image;
    private String description;

    @OneToOne
    @JoinColumn(name = "manager_id")
    private User manager;
}
