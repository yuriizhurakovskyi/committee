package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.FacultyRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.lviv.yurii.zhurakovskyi.my.selection.committee.ModelUtils.getFaculty;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase
public class FacultyServiceImplTest {

    @Autowired
    private FacultyService facultyService;

    @Autowired
    private FacultyRepository facultyRepository;

    @Test
    void saveTest() {
        List<Faculty> faculties = facultyRepository.findAll();
        assertThat(faculties, hasSize(0));
        Faculty faculty = getFaculty();
        facultyService.save(faculty);
        faculties = facultyRepository.findAll();
        assertThat(faculties, hasSize(1));
        Faculty facultyFromDB = faculties.get(0);
        assertEquals(faculty, facultyFromDB);
    }

    @Test
    void getAllFacultiesTest() {
        List<Faculty> faculties = facultyRepository.findAll();
        assertThat(faculties, hasSize(0));
        Faculty faculty = getFaculty();
        facultyRepository.save(faculty);
        faculties = facultyService.getAllFaculties();
        assertThat(faculties, hasSize(1));
        List<Faculty> facultiesFromDB = faculties;
        assertEquals(Collections.singletonList(faculty), facultiesFromDB);
    }

    @Test
    void findTest() {
        List<Faculty> faculties = facultyRepository.findAll();
        assertThat(faculties, hasSize(0));
        Faculty faculty = getFaculty();
        faculties = facultyRepository.findAll();
        facultyRepository.save(faculty);
        assertThat(faculties, hasSize(1));
        faculty = facultyService.find(1).get();
        Faculty facultyFromDB = faculties.get(0);
        assertEquals(faculty, facultyFromDB);
    }

    @Test
    void updateMaxNumberOfCandidatesTest() {
        List<Faculty> faculties = facultyRepository.findAll();
        assertThat(faculties, hasSize(0));
        Faculty faculty = getFaculty();
        faculties = facultyRepository.findAll();
        facultyRepository.save(faculty);
        assertThat(faculties, hasSize(1));
        faculty.setMaxNumberOfCandidates(50);
        facultyService.updateMaxNumberOfCandidates(faculty);
        faculties = facultyRepository.findAll();
        assertEquals(faculty.getMaxNumberOfCandidates(), faculties.get(0).getMaxNumberOfCandidates());
    }
}
