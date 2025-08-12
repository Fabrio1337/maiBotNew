package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Integer> {

}
