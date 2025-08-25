package com.spring.boot.maibotnew.user.handler;

import com.spring.boot.maibotnew.database.entity.User;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public interface UserCallbackHandler {
    void handle(Update update);
    void handleUserTextMessage(User user, Message message, User userFromTelegram);
    void sendWelcomeMessage(User user);
    void sendHelpMessage(User user);
    void sendMainMenuMessage(User user);
}
