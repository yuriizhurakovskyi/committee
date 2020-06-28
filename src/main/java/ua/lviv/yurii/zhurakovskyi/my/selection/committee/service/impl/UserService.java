package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;

public interface UserService extends UserDetailsService {
    void save(User user);

    User findUserByEmail(String email);

    UserDetails loadUserByUsername(String username);
}