package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Integer> {
    Group findGroupByGroupName(String groupName);
    void deleteGroupByGroupName(String groupName);
    void updateGroupByGroupName(String groupName, Group group);
    void setGroup(Group group);
}
