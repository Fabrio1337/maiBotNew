package com.spring.boot.maibotnew.database.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="alerts")
@Data
public class Alert {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="group_id")
    private Group group;

    @Column(name="message")
    private String message;
}
