package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;

import java.util.List;

public interface FacultyService {
	void save(Faculty faculty);

	List<Faculty> getAllFaculties();
}
