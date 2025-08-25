package com.spring.boot.maibotnew.user.buttons;

import com.spring.boot.maibotnew.database.entity.Subject;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import java.util.Set;

public interface UserButtonsInterface {
    public InlineKeyboardMarkup setWelcomeButtons();
    public InlineKeyboardMarkup setGroupsButtons(String course);
    public EditMessageReplyMarkup setSubjectButtons(long chatId, int messageId , Set<Subject> subjects);
    public InlineKeyboardMarkup setUserChoiceButtons();
    public EditMessageReplyMarkup setGroupButtons(long chatId, int messageId, String callbackData);
    public EditMessageReplyMarkup returnCoursesButtons(long chatId, int messageId);
    public EditMessageReplyMarkup returnToMenuButtons(long chatId, int messageId);
}
