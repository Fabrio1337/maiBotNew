package com.spring.boot.maibotnew.bot;
import com.spring.boot.maibotnew.admin.handler.AdminHandler;
import com.spring.boot.maibotnew.bot.executor.BotExecutor;
import com.spring.boot.maibotnew.user.handler.UserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class StartBot extends TelegramLongPollingBot implements BotExecutor {

    @Autowired
    private UserHandler userHandler;

    final private String BOT_NAME = "maiBestGroup_bot";


    public StartBot(@Value("${bot.token}") String botToken)
    {
        super(botToken);
    }
    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }


    @Override
    public void onUpdateReceived(Update update){
        userHandler.handle(update);
    }

    @Override
    public void execute(SendMessage message) throws Exception {
        super.execute(message);
    }
}
