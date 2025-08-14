package com.spring.boot.maibotnew.database.service;

import com.spring.boot.maibotnew.database.entity.User;
import com.spring.boot.maibotnew.database.registry.RepositoryRegistry;
import com.spring.boot.maibotnew.database.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Data
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findOrCreate(long chatId)
    {
        return userRepository.findUserByTelegramId(chatId)
                .orElseGet(() -> {
                    User newUser = new User();
                    newUser.setTelegramId(chatId);
                    return userRepository.save(newUser);
                });
    }
}
