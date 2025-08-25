package com.spring.boot.maibotnew.user.messages.Main;


import com.spring.boot.maibotnew.database.entity.User;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface MainMessagesInterface {
    void sendWelcomeMessage(User user);
    void sendHelpMessage(User user);
    void sendMainMenuMessage(User user);
}
