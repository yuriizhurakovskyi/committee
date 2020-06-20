package ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer maxNumberOfCandidates;
    @Column
    private Integer countOfStudents;
    @OneToMany(mappedBy = "faculty")
    private List<ApplicationInfo> applicationInfos;
    @OneToMany(mappedBy = "faculty")
    private List<ManagerStatement> managerStatements;

    public Faculty() {
    }

    public Faculty(String name, Integer maxNumberOfCandidates, Integer countOfStudents) {
        this.name = name;
        this.maxNumberOfCandidates = maxNumberOfCandidates;
        this.countOfStudents = countOfStudents;
    }

    public Faculty(Integer id, String name, Integer maxNumberOfCandidates, Integer countOfStudents) {
        this.id = id;
        this.name = name;
        this.maxNumberOfCandidates = maxNumberOfCandidates;
        this.countOfStudents = countOfStudents;
    }

    public Integer getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(Integer countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    public List<ManagerStatement> getManagerStatements() {
        return managerStatements;
    }

    public void setManagerStatements(List<ManagerStatement> managerStatements) {
        this.managerStatements = managerStatements;
    }

    public List<ApplicationInfo> getApplicationInfos() {
        return applicationInfos;
    }

    public void setApplicationInfos(List<ApplicationInfo> applicationInfos) {
        this.applicationInfos = applicationInfos;
    }

    public Integer getMaxNumberOfCandidates() {
        return maxNumberOfCandidates;
    }

    public void setMaxNumberOfCandidates(Integer maxNumberOfCandidates) {
        this.maxNumberOfCandidates = maxNumberOfCandidates;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((maxNumberOfCandidates == null) ? 0 : maxNumberOfCandidates.hashCode());
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
        Faculty other = (Faculty) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (maxNumberOfCandidates == null) {
            if (other.maxNumberOfCandidates != null)
                return false;
        } else if (!maxNumberOfCandidates.equals(other.maxNumberOfCandidates))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Faculty [id=" + id + ", name=" + name + ", numberOfStudents=" + maxNumberOfCandidates + "]";
    }

}
