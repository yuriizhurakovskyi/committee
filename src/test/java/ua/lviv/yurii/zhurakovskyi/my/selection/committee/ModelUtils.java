package ua.lviv.yurii.zhurakovskyi.my.selection.committee;

import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ManagerStatement;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;

import java.util.List;

import static ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Role.ROLE_USER;

public class ModelUtils {
    public static User getUser() {
        User user = new User();
        user.setEmail("e@i.ua");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        user.setPassword("password1");
        user.setRole(ROLE_USER);
        return user;
    }

    public static ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.setFirstName("FirstName");
        applicationInfo.setLastName("LastName");
        applicationInfo.setAge(18);
        applicationInfo.setScore(100);
        applicationInfo.setSchoolName("SchoolName");
        applicationInfo.setFaculty(getFaculty());
        applicationInfo.setId(1);
        return applicationInfo;
    }

    public static Faculty getFaculty() {
        Faculty faculty = new Faculty();
        faculty.setName("FacultyName");
        faculty.setCountOfStudents(100);
        faculty.setMaxNumberOfCandidates(1000);
        faculty.setId(1);
        return faculty;
    }

    public static ManagerStatement getManagerStatement(){
        ManagerStatement managerStatement = new ManagerStatement();
        managerStatement.setId(1);
        managerStatement.setName("name");
        managerStatement.setScore(100);
        managerStatement.setFaculty(getFaculty());
        return managerStatement;
    }
}
