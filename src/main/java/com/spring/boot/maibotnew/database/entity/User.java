package com.spring.boot.maibotnew.database.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="telegram_id")
    private long telegramId;

    @Column(name="username")
    private String username;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id") // Имя столбца в БД
    private Group group;

    @Column(name="is_admin")
    private boolean isAdmin;

    @Column(name="is_active")
    private boolean isActive;


    public Integer getGroupId() {
        return group != null ? group.getId() : null;
    }

    public String getGroupName() {
        return group != null ? group.getGroupName() : null;
    }

}
