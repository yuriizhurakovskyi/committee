package ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain;

import javax.persistence.*;

@Entity
@Table(name = "certificate")
public class Certificate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applicant_id")
	private User applicant;
	@Column
	private String schoolName;
	@Column
	private Integer score;

	public Certificate() {
	}

	public Certificate(User applicant, String schoolName, Integer score) {
		this.applicant = applicant;
		this.schoolName = schoolName;
		this.score = score;
	}

	public Certificate(Integer id, User applicant, String schoolName, Integer score) {
		this.id = id;
		this.applicant = applicant;
		this.schoolName = schoolName;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicant == null) ? 0 : applicant.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((schoolName == null) ? 0 : schoolName.hashCode());
		result = prime * result + ((score == null) ? 0 : score.hashCode());
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
		Certificate other = (Certificate) obj;
		if (applicant == null) {
			if (other.applicant != null)
				return false;
		} else if (!applicant.equals(other.applicant))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", applicant=" + applicant + ", schoolName=" + schoolName + ", score=" + score
				+ "]";
	}

}
