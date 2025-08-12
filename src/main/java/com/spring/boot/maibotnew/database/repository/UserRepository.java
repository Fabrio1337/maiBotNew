package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByTelegramId(long telegramId);
    User findUserByUsername(String username);

}
