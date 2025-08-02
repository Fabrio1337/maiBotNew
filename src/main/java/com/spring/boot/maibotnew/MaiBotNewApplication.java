package com.spring.boot.maibotnew;

import com.spring.boot.maibotnew.bot.StartBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class MaiBotNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaiBotNewApplication.class, args);
    }

}
