package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;

public interface UserService extends UserDetailsService {
	void save(User user);
}