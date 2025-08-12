package com.spring.boot.maibotnew.user.handler;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface UserCallbackHandler {
    void handle(Update update);
}
