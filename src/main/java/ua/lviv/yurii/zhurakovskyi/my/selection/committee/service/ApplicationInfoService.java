package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service;

import java.util.List;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;

public interface ApplicationInfoService {
	void save(ApplicationInfo applicationInfo);

	List<ApplicationInfo> getAllApplicationInfos();
}
