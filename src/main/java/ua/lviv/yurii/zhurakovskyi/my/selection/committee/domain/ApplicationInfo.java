package ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "application_info")
public class ApplicationInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applicant_id")
	private User applicant;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "certificate_id")
	private Certificate certificate;
	

	public ApplicationInfo() {
	}

	public ApplicationInfo(User applicant, Certificate certificate) {
		this.applicant = applicant;
		this.certificate = certificate;
	}

	public ApplicationInfo(Integer id, User applicant, Certificate certificate) {
		this.id = id;
		this.applicant = applicant;
		this.certificate = certificate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getApplicant() {
		return applicant;
	}

	public void setApplicant(User applicant) {
		this.applicant = applicant;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicant == null) ? 0 : applicant.hashCode());
		result = prime * result + ((certificate == null) ? 0 : certificate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicationInfo other = (ApplicationInfo) obj;
		if (applicant == null) {
			if (other.applicant != null)
				return false;
		} else if (!applicant.equals(other.applicant))
			return false;
		if (certificate == null) {
			if (other.certificate != null)
				return false;
		} else if (!certificate.equals(other.certificate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ApplicationInfo [id=" + id + ", applicant=" + applicant + ", certificate=" + certificate + "]";
	}

}
