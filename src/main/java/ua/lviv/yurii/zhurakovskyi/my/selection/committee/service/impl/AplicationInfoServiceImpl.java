package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.ApplicationInfoRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.ApplicationInfoService;

@Service
public class AplicationInfoServiceImpl implements ApplicationInfoService {
	private final ApplicationInfoRepository repository;

	@Autowired
	public AplicationInfoServiceImpl(ApplicationInfoRepository repository) {
		this.repository = repository;
	}

	@Override
	public void save(ApplicationInfo applicationInfo) {
		if (applicationInfo != null) {
			repository.save(applicationInfo);
		}
	}

	@Override
	public List<ApplicationInfo> getAllApplicationInfos() {
		return repository.findAll();
	}

}
