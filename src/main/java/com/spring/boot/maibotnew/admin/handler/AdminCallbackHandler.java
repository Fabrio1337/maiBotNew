package com.spring.boot.maibotnew.admin.handler;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface AdminCallbackHandler {
    void handle(Update update);
}
