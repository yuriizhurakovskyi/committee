package ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.UserRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.lviv.yurii.zhurakovskyi.my.selection.committee.ModelUtils.getUser;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    void saveTest() {
        userRepository.deleteAll();
        List<User> users = userRepository.findAll();
        assertThat(users, hasSize(0));
        User user = getUser();
        userService.save(user);
        users = userRepository.findAll();
        assertThat(users, hasSize(1));
        User userFromDB = users.stream().findFirst().get();
        assertEquals(user.getFirstName(), userFromDB.getFirstName());
        assertEquals(user.getLastName(), userFromDB.getLastName());
        assertEquals(user.getAge(), userFromDB.getAge());
        assertEquals(user.getEmail(), userFromDB.getEmail());
    }

    @Test
    void findUserByEmailTest() {
        userRepository.deleteAll();
        List<User> users = userRepository.findAll();
        assertThat(users, hasSize(0));
        User user = getUser();
        userService.save(user);
        users = userRepository.findAll();
        assertThat(users, hasSize(1));
        User findUserByEmail = userService.findUserByEmail(user.getEmail());
        assertEquals(user.getFirstName(), findUserByEmail.getFirstName());
        assertEquals(user.getLastName(), findUserByEmail.getLastName());
        assertEquals(user.getAge(), findUserByEmail.getAge());
        assertEquals(user.getEmail(), findUserByEmail.getEmail());
    }

    @Test
    void loadUserByUsername() {
        userRepository.deleteAll();
        List<User> users = userRepository.findAll();
        assertThat(users, hasSize(0));
        User user = getUser();
        userService.save(user);
        users = userRepository.findAll();
        assertThat(users, hasSize(1));
        User loadUserByUsername = (User) userService.loadUserByUsername(user.getEmail());
        assertEquals(user.getFirstName(), loadUserByUsername.getFirstName());
        assertEquals(user.getLastName(), loadUserByUsername.getLastName());
        assertEquals(user.getAge(), loadUserByUsername.getAge());
        assertEquals(user.getEmail(), loadUserByUsername.getEmail());
    }
}
