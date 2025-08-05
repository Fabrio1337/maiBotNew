package com.spring.boot.maibotnew.database.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="materials")
@Data
public class Material {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="file_data")
    private byte[] fileData;

    @Column(name="file_name")
    private String fileName;

    @Column(name="file_type")
    private String fileType;

    @Column(name="file_size")
    private int fileSize;

    @Column(name="material_type")
    private String materialType; //тип документа: документ, видео, ссылка, изображение

    @Column(name="url")
    private String url;
}
