package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService {
	void save(Faculty faculty);

	List<Faculty> getAllFaculties();

	Optional<Faculty> find(Integer facultyId);
}
