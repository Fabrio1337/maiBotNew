package com.spring.boot.maibotnew.user.messages.Main;

import com.spring.boot.maibotnew.bot.executor.TelegramBotExecutor;
import com.spring.boot.maibotnew.database.entity.User;
import com.spring.boot.maibotnew.user.buttons.UserButtonsInterface;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Component
@Data
public class MainMessages implements MainMessagesInterface{


    private final UserButtonsInterface userButtons;
    private final TelegramBotExecutor executor;

    @Autowired
    public MainMessages(UserButtonsInterface userButtons, @Lazy TelegramBotExecutor executor) {
        this.userButtons = userButtons;
        this.executor = executor;
    }
    @Override
    public void sendWelcomeMessage(User user) {
        String text = String.format("%s, Добро пожаловать в самого лучшего бота для учебы\uD83D\uDCC5!\n" +
                "Чтобы начать использовать бота, выберите курс и группу\uD83D\uDE0A", user.getUsername());

        SendMessage message = SendMessage.builder().chatId(user.getTelegramId()).text(text)
                .replyMarkup(userButtons.setWelcomeButtons()).build();

        executor.send(message);
    }

    @Override
    public void sendHelpMessage(User user) {
    }

    @Override
    public void sendMainMenuMessage(User user) {

        String text = String.format("%s, Добро пожаловать в самого лучшего бота для учебы\uD83D\uDCC5!\n" +
                "напиши /commands или /help чтобы узнать какие команды может обрабатывать бот\uD83D\uDCDD", user.getUsername());

        SendMessage message = SendMessage.builder().chatId(user.getTelegramId()).text(text)
                .replyMarkup(userButtons.setUserChoiceButtons()).build();


        executor.send(message);
    }
}
