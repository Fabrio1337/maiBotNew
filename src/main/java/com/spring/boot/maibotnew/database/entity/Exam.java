package com.spring.boot.maibotnew.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "exams")
@Data
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="group_id")
    private Group group;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "exam")
    private Subject subject;

    @Column(name = "exam_date")
    private LocalDate examDate;

    @Column(name = "exam_time")
    private LocalTime examTime;

    @Column(name = "location")
    private String location;

    @Column(name = "exam_type")
    private String examType; /** Тип экзамена: экзамен/контрольная/зачет **/

    @Column(name = "description")
    private String description;

}
