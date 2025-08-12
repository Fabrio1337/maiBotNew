package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkRepository extends JpaRepository<Homework, Integer> {

}
