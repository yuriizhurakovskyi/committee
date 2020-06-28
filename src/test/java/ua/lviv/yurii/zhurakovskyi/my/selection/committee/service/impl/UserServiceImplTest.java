package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringRunner;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.UserRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.lviv.yurii.zhurakovskyi.my.selection.committee.ModelUtils.getUser;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    void saveTest() {
        List<User> users = userRepository.findAll();
        assertThat(users, hasSize(0));
        User user = getUser();
        userService.save(user);
        users = userRepository.findAll();
        assertThat(users, hasSize(1));
        User userFromDB = users.get(0);
        assertEquals(user, userFromDB);
    }

    @Test
    void findUserByEmailTest() {
        List<User> users = userRepository.findAll();
        assertThat(users, hasSize(0));
        User user = getUser();
        userService.save(user);
        users = userRepository.findAll();
        assertThat(users, hasSize(1));
        User findUserByEmail = userService.findUserByEmail(user.getEmail());
        assertEquals(user, findUserByEmail);
    }

    @Test
    void loadUserByUsername() {
        List<User> users = userRepository.findAll();
        assertThat(users, hasSize(0));
        User user = getUser();
        userService.save(user);
        users = userRepository.findAll();
        assertThat(users, hasSize(1));
        UserDetails loadUserByUsername = userService.loadUserByUsername(user.getEmail());
        assertEquals(user, loadUserByUsername);
    }
}
