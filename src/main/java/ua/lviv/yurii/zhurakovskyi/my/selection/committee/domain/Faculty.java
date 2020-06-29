package ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name) &&
                Objects.equals(maxNumberOfCandidates, faculty.maxNumberOfCandidates) &&
                Objects.equals(countOfStudents, faculty.countOfStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxNumberOfCandidates, countOfStudents);
    }

    @Override
    public String toString() {
        return "Faculty [id=" + id + ", name=" + name + ", numberOfStudents=" + maxNumberOfCandidates + "]";
    }

}
