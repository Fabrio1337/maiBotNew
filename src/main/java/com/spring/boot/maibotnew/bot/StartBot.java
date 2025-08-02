package com.spring.boot.maibotnew.bot;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class StartBot extends TelegramLongPollingBot {

    final private String BOT_TOKEN = "7569873625:AAEzrnpYHP1IBtic_2Sxl9m6GyD4RtEJl3M";
    final private String BOT_NAME = "maiBestGroup_bot";
    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update){

    }
}
