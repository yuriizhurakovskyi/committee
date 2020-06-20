package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service;

import org.springframework.web.multipart.MultipartFile;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Faculty;

import java.io.IOException;
import java.util.Base64;

public interface ApplicationInfoDTOHelper {
    static ApplicationInfo createEntity(MultipartFile image,
                                        String firstName,
                                        String lastName,
                                        Integer age,
                                        Integer score,
                                        String schoolName,
                                        Faculty faculty
    ) throws IOException {
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.setImageFile(image.getBytes());
        applicationInfo.setFirstName(firstName);
        applicationInfo.setLastName(lastName);
        applicationInfo.setAge(age);
        applicationInfo.setScore(score);
        applicationInfo.setSchoolName(schoolName);
        applicationInfo.setFaculty(faculty);
        applicationInfo.setEncodedImage(Base64.getEncoder().encodeToString(image.getBytes()));
        return applicationInfo;
    }
}
