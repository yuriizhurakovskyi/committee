package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.ManagerStatementRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ManagerStatement;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.lviv.yurii.zhurakovskyi.my.selection.committee.ModelUtils.getManagerStatement;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase
public class ManagerStatementServiceImplTest {

    @Autowired
    private ManagerStatementService managerStatementService;

    @Autowired
    private ManagerStatementRepository managerStatementRepository;

    @Test
    void saveTest() {
        List<ManagerStatement> managerStatements = managerStatementRepository.findAll();
        assertThat(managerStatements, hasSize(0));
        ManagerStatement managerStatement = getManagerStatement();
        managerStatementService.save(managerStatement);
        managerStatements = managerStatementRepository.findAll();
        assertThat(managerStatements, hasSize(1));
        ManagerStatement managerStatementFromDB = managerStatements.get(0);
        assertEquals(managerStatement, managerStatementFromDB);
    }

    @Test
    void getAllManagerStatements() {
        List<ManagerStatement> managerStatements = managerStatementRepository.findAll();
        assertThat(managerStatements, hasSize(0));
        ManagerStatement managerStatement = getManagerStatement();
        managerStatementRepository.save(managerStatement);
        managerStatements = managerStatementService.getAllManagerStatements();
        assertThat(managerStatements, hasSize(1));
        List<ManagerStatement> managerStatementsFromDB = managerStatements;
        assertEquals(Collections.singletonList(managerStatement), managerStatementsFromDB);
    }

    @Test
    void findSuccessStatements() {
        List<ManagerStatement> managerStatements = managerStatementRepository.findAll();
        assertThat(managerStatements, hasSize(0));
        ManagerStatement managerStatement = getManagerStatement();
        managerStatementRepository.save(managerStatement);
        managerStatements = managerStatementRepository.findAll();
        assertThat(managerStatements, hasSize(1));
        List<ManagerStatement> actualSuccessManagerStatements = managerStatementService.findSuccessStatements();
        assertEquals(Collections.singletonList(managerStatement), actualSuccessManagerStatements);
    }
}
