package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ManagerStatement;

import java.util.List;

public interface ManagerStatementService {
    void save(ManagerStatement statement);

    List<ManagerStatement> getAllManagerStatements();

    List<ManagerStatement> findSuccessStatements();
}
