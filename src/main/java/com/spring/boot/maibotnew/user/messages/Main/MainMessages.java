package com.spring.boot.maibotnew.user.messages.Main;

import com.spring.boot.maibotnew.database.entity.User;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Component
public class MainMessages implements MainMessagesInterface{

    @Override
    public SendMessage sendWelcomeMessage(User user) {
        return SendMessage.builder().build();
    }

    @Override
    public SendMessage sendHelpMessage(User user) {
        return SendMessage.builder().build();
    }

    @Override
    public SendMessage sendMainMenuMessage(User user) {
        return SendMessage.builder().build();
    }
}
