package ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "statement")
public class ManagerStatement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;
    @Column
    private String name;
    @Column
    private Integer score;

    public ManagerStatement() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public String getFacultyName() {
        return faculty.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagerStatement that = (ManagerStatement) o;
        return Objects.equals(faculty, that.faculty) &&
                Objects.equals(name, that.name) &&
                Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, name, score);
    }

    @Override
    public String toString() {
        return "ManagerStatement{" +
                "id=" + id +
                ", faculty=" + faculty.getName() +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
