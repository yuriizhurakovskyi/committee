package ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);

	Optional<User> findByEmail(String email);
}
