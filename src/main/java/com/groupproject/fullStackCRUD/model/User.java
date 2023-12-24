package com.groupproject.fullStackCRUD.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity //for creating User as a Table name
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    @NotBlank(message = "Username can not be blank")
    private String username;
    @NotBlank(message = "Name can not be blank")
    private String name;
    @Email(message = "Invalid email address")
    private String email;

    public User() {
        super();
    }

    public User(Long id, String username, String name, String email) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.email = email;
    }
}
