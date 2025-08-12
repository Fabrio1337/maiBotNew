package com.spring.boot.maibotnew.user.handler;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@Data
public class UserHandler implements UserCallbackHandler {
    @Override
    public void handle(Update update) {

    }
}
