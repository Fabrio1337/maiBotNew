package com.spring.boot.maibotnew.configuration;

import com.spring.boot.maibotnew.bot.StartBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
public class BotConfiguration {

    @Autowired
    private StartBot startBot;

    public TelegramBotsApi telegramBotsApi() {
        try {
            return new TelegramBotsApi(DefaultBotSession.class);
        }
        catch (TelegramApiException e) {
            throw new RuntimeException("Failed to create TelegramBotsApi", e);
        }
    }

    @EventListener(ApplicationReadyEvent.class)
    public void refisterBot()
    {
        try {
            telegramBotsApi().registerBot(startBot);
        }
        catch (TelegramApiException e) {
            throw new RuntimeException("Failed to register Bot", e);
        }
    }
}
