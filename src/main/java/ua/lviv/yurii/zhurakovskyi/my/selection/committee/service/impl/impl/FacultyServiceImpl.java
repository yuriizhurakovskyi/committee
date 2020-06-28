package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.FacultyRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.FacultyService;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService {
    private Logger logger = LoggerFactory.getLogger(FacultyServiceImpl.class);
    private final FacultyRepository facultyRepository;

    @Autowired
    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public void save(Faculty faculty) {
        if (faculty != null)
            logger.debug("Save a Faculty " + faculty);
        facultyRepository.save(faculty);
    }

    @Override
    public List<Faculty> getAllFaculties() {
        logger.debug("Get All Faculties");
        return facultyRepository.findAll();
    }

    public Optional<Faculty> find(Integer facultyId) {
        logger.debug("Find A Faculty By facultyId=" + facultyId);
        return facultyRepository.findById(facultyId);
    }

    @Override
    public void updateMaxNumberOfCandidates(Faculty faculty) {
        logger.debug("Update Max Number Of Candidates=" + faculty.getMaxNumberOfCandidates());
        facultyRepository.updateMaxNumberOfCandidates(faculty.getMaxNumberOfCandidates(), faculty.getId());
    }

}
