package com.jsp.model;

import com.jsp.resturant_module.model.Resturant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user_table")
@SequenceGenerator(name="user-seq" , allocationSize =1,initialValue=1000)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    @Column(unique = true)
    private String email;
    private Long phone;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String password;
    private boolean active;

    @OneToOne(mappedBy="manager")
    private Resturant resturant;


}
