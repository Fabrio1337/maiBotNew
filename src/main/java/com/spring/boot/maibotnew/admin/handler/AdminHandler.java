package com.spring.boot.maibotnew.admin.handler;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Data
public class AdminHandler implements AdminCallbackHandler{
    @Override
    public void handle(Update update) {

    }
}
