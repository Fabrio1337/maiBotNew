package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface GroupRepository extends JpaRepository<Group, Integer> {
    Group findGroupByGroupName(String groupName);
    @Modifying
    @Transactional
    void deleteGroupByGroupName(String groupName);

}