package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Certificate;

public interface CertificateService {
	void save(Certificate certificate);
	Certificate findByUser(Integer userId);
}
