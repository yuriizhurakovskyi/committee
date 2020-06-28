package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.ApplicationInfoRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.lviv.yurii.zhurakovskyi.my.selection.committee.ModelUtils.getApplicationInfo;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase
public class ApplicationInfoServiceImplTest {

    @Autowired
    private ApplicationInfoService applicationInfoService;

    @Autowired
    private ApplicationInfoRepository applicationInfoRepository;

    @Test
    void saveTest() {
        List<ApplicationInfo> applicationInfos = applicationInfoRepository.findAll();
        assertThat(applicationInfos, hasSize(0));
        ApplicationInfo applicationInfo = getApplicationInfo();
        applicationInfoService.save(applicationInfo);
        applicationInfos = applicationInfoRepository.findAll();
        assertThat(applicationInfos, hasSize(1));
        ApplicationInfo applicationInfoFromDB = applicationInfos.get(0);
        assertEquals(applicationInfo, applicationInfoFromDB);
    }

    @Test
    void getAllApplicationInfosTest() {
        List<ApplicationInfo> applicationInfos = applicationInfoRepository.findAll();
        assertThat(applicationInfos, hasSize(0));
        ApplicationInfo applicationInfo = getApplicationInfo();
        applicationInfoRepository.save(applicationInfo);
        applicationInfos = applicationInfoService.getAllApplicationInfos();
        assertThat(applicationInfos, hasSize(1));
        List<ApplicationInfo> applicationInfosFromDB = applicationInfos;
        assertEquals(Collections.singletonList(applicationInfo), applicationInfosFromDB);
    }

    @Test
    void findTest() {
        List<ApplicationInfo> applicationInfos = applicationInfoRepository.findAll();
        assertThat(applicationInfos, hasSize(0));
        ApplicationInfo applicationInfo = getApplicationInfo();
        applicationInfos = applicationInfoRepository.findAll();
        applicationInfoService.save(applicationInfo);
        assertThat(applicationInfos, hasSize(1));
        applicationInfo = applicationInfoService.find(1);
        ApplicationInfo applicationInfoFromDB = applicationInfos.get(0);
        assertEquals(applicationInfo, applicationInfoFromDB);
    }

    @Test
    void deleteTest() {
        List<ApplicationInfo> applicationInfos = applicationInfoRepository.findAll();
        assertThat(applicationInfos, hasSize(0));
        ApplicationInfo applicationInfo = getApplicationInfo();
        applicationInfoService.save(applicationInfo);
        applicationInfos = applicationInfoRepository.findAll();
        assertThat(applicationInfos, hasSize(1));
        applicationInfoService.delete(1);
        applicationInfos = applicationInfoRepository.findAll();
        assertThat(applicationInfos, hasSize(0));
    }
}
