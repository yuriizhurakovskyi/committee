package ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;

@Repository
public interface ApplicationInfoRepository extends JpaRepository<ApplicationInfo, Integer> {

}
