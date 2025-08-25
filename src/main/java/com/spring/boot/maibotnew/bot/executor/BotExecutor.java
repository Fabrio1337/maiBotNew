package com.spring.boot.maibotnew.bot.executor;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;


public interface BotExecutor {
    void execute(SendMessage message) throws Exception;
}