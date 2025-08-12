package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository extends JpaRepository<Holiday, Integer> {
}
