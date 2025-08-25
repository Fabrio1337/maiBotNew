package com.spring.boot.maibotnew.user.buttons;

import com.spring.boot.maibotnew.database.entity.Subject;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
public class UserButtons implements UserButtonsInterface{
    @Override
    public InlineKeyboardMarkup setWelcomeButtons() {
        InlineKeyboardMarkup welcomeButtons = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows = new ArrayList<>();

        String[] courses = {"1", "2", "3", "4", "5"};

        List<InlineKeyboardButton> row = new ArrayList<>();

        for (int i = 0; i < courses.length; i++) {
            InlineKeyboardButton button = InlineKeyboardButton.builder()
                    .text(courses[i])
                    .callbackData("course_" + courses[i])
                    .build();

            row.add(button);

            if (row.size() == 2 || i == courses.length - 1) {
                rows.add(row);
                row = new ArrayList<>();
            }
        }
        welcomeButtons.setKeyboard(rows);

        return welcomeButtons;
    }

    @Override
    public InlineKeyboardMarkup setGroupsButtons(String course) {
        return null;
    }

    @Override
    public EditMessageReplyMarkup setSubjectButtons(long chatId, int messageId, Set<Subject> subjects) {
        return null;
    }

    @Override
    public InlineKeyboardMarkup setUserChoiceButtons() {

        InlineKeyboardMarkup choiseButtons = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsButtons = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();


        String[] choices = {"Расписание", "ДЗ", "Информация"};
        for (int i = 0; i < choices.length; i++) {
            InlineKeyboardButton button = InlineKeyboardButton.builder()
                    .text(choices[i])
                    .callbackData(choices[i])
                    .build();


            row.add(button);

            if (row.size() == 2 || i == choices.length - 1) {
                rowsButtons.add(row);
                row = new ArrayList<>();
            }
        }
        choiseButtons.setKeyboard(rowsButtons);

        return choiseButtons;
    }

    @Override
    public EditMessageReplyMarkup setGroupButtons(long chatId, int messageId, String callbackData) {
        return null;
    }

    @Override
    public EditMessageReplyMarkup returnCoursesButtons(long chatId, int messageId) {
        return null;
    }

    @Override
    public EditMessageReplyMarkup returnToMenuButtons(long chatId, int messageId) {
        return null;
    }
}
