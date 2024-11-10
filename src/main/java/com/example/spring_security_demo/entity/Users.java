package com.example.spring_security_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Users {

    @Id
    @Column
    private int id;

    @Column
    private String username;

    @Column
    private String password;

    public Users() {
    }
}