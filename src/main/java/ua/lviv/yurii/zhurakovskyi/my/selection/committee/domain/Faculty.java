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
    private Integer numberOfStudents;
    @OneToMany(mappedBy = "faculty")
    private List<ApplicationInfo> applicationInfos;
    @OneToMany(mappedBy = "faculty")
    private List<ManagerStatement> managerStatements;

    public Faculty() {
    }

    public Faculty(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public Faculty(Integer id, String name, Integer numberOfStudents) {
        this.id = id;
        this.name = name;
        this.numberOfStudents = numberOfStudents;
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

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
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
        result = prime * result + ((numberOfStudents == null) ? 0 : numberOfStudents.hashCode());
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
        if (numberOfStudents == null) {
            if (other.numberOfStudents != null)
                return false;
        } else if (!numberOfStudents.equals(other.numberOfStudents))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Faculty [id=" + id + ", name=" + name + ", numberOfStudents=" + numberOfStudents + "]";
    }

}
