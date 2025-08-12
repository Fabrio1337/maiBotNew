package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
}
