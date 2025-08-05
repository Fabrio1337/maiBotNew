package com.spring.boot.maibotnew.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
@Data
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="group_name")
    private String groupName;

    @Column(name="course_number")
    private byte courseNumber;

    @OneToOne(cascade=CascadeType.ALL, mappedBy = "group")
    private Holiday holiday;

    @OneToMany(mappedBy = "group",  cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Exam> exams = new ArrayList<>();

    @OneToMany(mappedBy = "group",  cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "group",  cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Subject> subjects = new ArrayList<>();

    @OneToMany(mappedBy = "group",  cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Alert> alerts = new ArrayList<>();

}
