package com.spring.boot.maibotnew.bot;
import com.spring.boot.maibotnew.admin.handler.AdminHandler;
import com.spring.boot.maibotnew.user.handler.UserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class StartBot extends TelegramLongPollingBot {

    @Autowired
    private UserHandler userHandler;


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
        userHandler.handle(update);
    }
}
