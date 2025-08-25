package com.spring.boot.maibotnew.user.handler;

import com.spring.boot.maibotnew.admin.handler.AdminHandler;
import com.spring.boot.maibotnew.bot.executor.TelegramBotExecutor;
import com.spring.boot.maibotnew.database.entity.User;
import com.spring.boot.maibotnew.database.registry.RepositoryRegistry;
import com.spring.boot.maibotnew.user.messages.Main.MainMessagesInterface;
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

    @Autowired
    private MainMessagesInterface mainMessages;

    @Override
    public void handle(Update update) {

        if(update.hasMessage() && update.getMessage().hasText()) {

            org.telegram.telegrambots.meta.api.objects.User userFromTelegram = update.getMessage().getFrom();

            User userFromTg = new User();
            userFromTg.setTelegramId(userFromTelegram.getId());
            userFromTg.setUsername(userFromTelegram.getUserName());
            userFromTg.setFirstName(userFromTelegram.getFirstName());
            userFromTg.setLastName(userFromTelegram.getLastName());

            User user = repositoryRegistry.getUserService()
                    .getUserRepository()
                    .findUserByTelegramId(userFromTelegram.getId())
                    .orElse(null);
            if(user != null && user.isAdmin()) {
                adminHandler.handle(update);
            }
            else {
                handleUserTextMessage(user, update.getMessage(), userFromTg);
            }
        }
    }

    @Override
    public void handleUserTextMessage(User user, Message message, User userFromTg) {


        switch(message.getText()) {
            case "/start":
                if(user == null)
                {
                    repositoryRegistry.getUserService().getUserRepository().save(userFromTg);
                    sendWelcomeMessage(userFromTg);

                }
                else sendMainMenuMessage(user);
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
        mainMessages.sendWelcomeMessage(user);

    }

    @Override
    public void sendHelpMessage(User user) {

    }

    @Override
    public void sendMainMenuMessage(User user) {
        mainMessages.sendMainMenuMessage(user);
    }
}
