package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.UserRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void save(User user) {
        if (user != null) {
            try {
                findUserByEmail(user.getEmail());
            } catch (NoSuchElementException e) {
                logger.debug("User with " + user.getEmail() + " not found");
                logger.debug("Save The User " + user);
                userRepository.save(user);
            }
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug("Find User By Username(Find By Email)");
        return userRepository.findByEmail(username).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User findUserByEmail(String email) {
        logger.debug("Find User By Email)");
        return userRepository.findByEmail(email).orElseThrow(NoSuchElementException::new);
    }
}
