package ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.ApplicationInfo;

@Repository
public interface ApplicationInfoRepository extends JpaRepository<ApplicationInfo, Integer> {
    @Transactional
    @Modifying
    @Query("delete from ApplicationInfo a where a.id = ?1")
    void delete(Integer applicationInfoId);
}
