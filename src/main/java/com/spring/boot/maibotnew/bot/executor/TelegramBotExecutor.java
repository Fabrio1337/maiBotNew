package com.spring.boot.maibotnew.bot.executor;

import com.spring.boot.maibotnew.bot.StartBot;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class TelegramBotExecutor{

    @Autowired
    private BotExecutor botExecutor;


    public void send(SendMessage message) {
        try {
            botExecutor.execute(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

