package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.FacultyRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.FacultyService;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {
	private final FacultyRepository facultyRepository;

	@Autowired
	public FacultyServiceImpl(FacultyRepository facultyRepository) {
		this.facultyRepository = facultyRepository;
	}

	@Override
	public void save(Faculty faculty) {
		if (faculty != null)
			facultyRepository.save(faculty);
	}

	@Override
	public List<Faculty> getAllFaculties() {
		return facultyRepository.findAll();
	}

}
