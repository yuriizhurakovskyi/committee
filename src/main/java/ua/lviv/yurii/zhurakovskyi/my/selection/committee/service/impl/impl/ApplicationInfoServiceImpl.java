package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.ApplicationInfoRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl.ApplicationInfoService;

@Service
public class ApplicationInfoServiceImpl implements ApplicationInfoService {
    private Logger logger = LoggerFactory.getLogger(ApplicationInfoServiceImpl.class);
    private final ApplicationInfoRepository repository;

    @Autowired
    public ApplicationInfoServiceImpl(ApplicationInfoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(ApplicationInfo applicationInfo) {
        if (applicationInfo != null) {
            logger.debug("Save An Application Info " + applicationInfo);
            repository.save(applicationInfo);
        }
    }

    @Override
    public List<ApplicationInfo> getAllApplicationInfos() {
        logger.debug("Get All Application Infos");
        return repository.findAll();
    }

    @Override
    public ApplicationInfo find(Integer applicationInfoId) {
        logger.debug("Find An Application Info By applicationInfoId=" + applicationInfoId);
        return repository.findById(applicationInfoId).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public void delete(Integer applicationInfoId) {
        logger.debug("Delete An Application Info By applicationInfoId=" + applicationInfoId);
        repository.delete(applicationInfoId);
    }
}
