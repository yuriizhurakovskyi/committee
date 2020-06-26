package ua.lviv.yurii.zhurakovskyi.my.selection.committee;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.UserRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.UserService;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Role.ROLE_USER;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase
class MySelectionCommitteeApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        List<User> users = userRepository.findAll();
        assertThat(users, hasSize(0));

        User user = new User();
        user.setEmail("e@i.ua");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        user.setPassword("password1");
        user.setRole(ROLE_USER);

        userService.save(user);
        users = userRepository.findAll();
        assertThat(users, hasSize(1));
        User userFromDB = users.get(0);

        assertEquals(userFromDB.getEmail(), user.getEmail());
        assertEquals(userFromDB.getFirstName(), user.getFirstName());
        assertEquals(userFromDB.getLastName(), user.getLastName());
        assertEquals(userFromDB.getRole(), user.getRole());
    }

}
