package com.spring.boot.maibotnew.database.repository;

import com.spring.boot.maibotnew.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByTelegramId(long telegramId);
    Optional<User>  findUserByUsername(String username);


}
