package com.spring.boot.maibotnew.user.messages.Main;


import com.spring.boot.maibotnew.database.entity.User;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public interface MainMessagesInterface {
    SendMessage sendWelcomeMessage(User user);
    SendMessage sendHelpMessage(User user);
    SendMessage sendMainMenuMessage(User user);
}
