package com.spring.boot.maibotnew.user.handler;

import com.spring.boot.maibotnew.admin.handler.AdminHandler;
import com.spring.boot.maibotnew.database.entity.User;
import com.spring.boot.maibotnew.database.registry.RepositoryRegistry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserHandler implements UserCallbackHandler {

    @Autowired
    private RepositoryRegistry repositoryRegistry;

    @Autowired
    private AdminHandler adminHandler;

    @Override
    public void handle(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()) {
            long chatId = update.getMessage().getChatId();
            User user = repositoryRegistry.getUserService().findOrCreate(chatId);
            if(user.isAdmin()) {
                adminHandler.handle(update);
            }
            else {
                handleUserTextMessage(user, update.getMessage());
            }
        }
    }

    @Override
    public void handleUserTextMessage(User user, Message message) {


        switch(message.getText()) {
            case "/start":
                sendWelcomeMessage(user);
                break;
            case "/help":
                sendHelpMessage(user);
                break;
            default:
                // Для любого другого текста показываем главное меню
                sendMainMenuMessage(user);
        }
    }

    @Override
    public void sendWelcomeMessage(User user) {

    }

    @Override
    public void sendHelpMessage(User user) {

    }

    @Override
    public void sendMainMenuMessage(User user) {

    }
}
