package ru.otus.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.domain.Student;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final IOService ioService;

    @Override
    public Student determineCurrentStudent() {
        var firstName = ioService.readStringWithPrompt("StudentService.input.first.name");
        var lastName = ioService.readStringWithPrompt("StudentService.input.last.name");
        return new Student(firstName, lastName);
    }
}
