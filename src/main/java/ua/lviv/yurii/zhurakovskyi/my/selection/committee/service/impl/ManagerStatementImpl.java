package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.ManagerStatementRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ManagerStatement;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.ManagerStatementService;

import java.util.List;

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
}
