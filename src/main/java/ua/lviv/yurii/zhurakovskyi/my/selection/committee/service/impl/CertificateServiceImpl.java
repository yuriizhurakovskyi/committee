package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.springframework.stereotype.Service;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.CertificateRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Certificate;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.CertificateService;

@Service
public class CertificateServiceImpl implements CertificateService {
	private final CertificateRepository repository;

	public CertificateServiceImpl(CertificateRepository repository) {
		this.repository = repository;
	}

	@Override
	public void save(Certificate certificate) {
		if (certificate != null) {
			repository.save(certificate);
		}
	}

	@Override
	public Certificate findByUser(Integer applicantId) {
		return repository.findByApplicant(applicantId);
	}

}
