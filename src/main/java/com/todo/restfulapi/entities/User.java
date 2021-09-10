package com.todo.restfulapi.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user",,schema = "public")
@Data // lombok
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private String role;
    @Column(name = "enabled")
    private boolean enabled;

    public User(String username, String password, String role, boolean enabled, String name) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
    }
}
