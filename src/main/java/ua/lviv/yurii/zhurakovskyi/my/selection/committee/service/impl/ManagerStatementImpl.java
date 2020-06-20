package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.ManagerStatementRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ManagerStatement;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.ManagerStatementService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManagerStatementImpl implements ManagerStatementService {
    private final ManagerStatementRepository repository;

    @Autowired
    public ManagerStatementImpl(ManagerStatementRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(ManagerStatement statement) {
        if (statement != null)
            repository.save(statement);
    }

    @Override
    public List<ManagerStatement> getAllManagerStatements() {
        return repository.findAll();
    }

    @Override
    public List<ManagerStatement> findSuccessStatements() {
        List<ManagerStatement> statements = repository.findAll();
        List<Faculty> faculties = statements.stream().map(ManagerStatement::getFaculty).collect(Collectors.toList());
        List<ManagerStatement> result = new ArrayList<>();
        for (Faculty faculty : faculties) {
            List<ManagerStatement> subList = statements
                    .stream()
                    .filter(s -> s.getScore() > 70 && s.getFacultyName().equals(faculty.getName()))
                    .limit(faculty.getCountOfStudents())
                    .collect(Collectors.toCollection(ArrayList::new));
            result.addAll(subList);
        }
        return result;
    }
}
