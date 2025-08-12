package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

    Subject findSubjectBySubjectName(String subjectName);
}
