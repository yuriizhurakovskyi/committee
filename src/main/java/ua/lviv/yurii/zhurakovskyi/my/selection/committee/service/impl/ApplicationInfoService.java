package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import java.util.List;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;

public interface ApplicationInfoService {
	void save(ApplicationInfo applicationInfo);

	List<ApplicationInfo> getAllApplicationInfos();

    ApplicationInfo find(Integer applicationInfoId);

	void delete(Integer applicationInfoId);
}
