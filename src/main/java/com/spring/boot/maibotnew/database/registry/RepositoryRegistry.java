package com.spring.boot.maibotnew.database.registry;

import com.spring.boot.maibotnew.database.repository.*;
import com.spring.boot.maibotnew.database.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class RepositoryRegistry {

    @Autowired
    private AlertRepository alertRepository;

    @Autowired
    private ExamRepository examRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private HolidayRepository holidayRepository;

    @Autowired
    private HomeworkRepository homeworkRepository;

    @Autowired
    private MaterialRepository materialRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private UserService userService;
}
