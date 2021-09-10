package com.todo.restfulapi.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "task")
@Data // lombok
public class Task {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private int status;

    @JoinColumn(name="user_id")
    @ManyToOne (targetEntity = User.class)
    private User user;
}
