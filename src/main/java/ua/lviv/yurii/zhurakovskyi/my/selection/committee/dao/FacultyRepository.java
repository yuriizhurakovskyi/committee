package ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
    @Transactional
    @Modifying
    @Query("update Faculty f set f.numberOfStudents = ?1 where f.id = ?2")
    void updateNumberOfStudents(Integer numberOfStudents, Integer facultyId);
}
