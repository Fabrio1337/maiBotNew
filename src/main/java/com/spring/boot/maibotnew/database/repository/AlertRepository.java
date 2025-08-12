package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Integer> {
}
