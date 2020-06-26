package ua.lviv.yurii.zhurakovskyi.my.selection.committee;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.dao.UserRepository;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.User;
import ua.lviv.yurii.zhurakovskyi.my.selection.committee.service.UserService;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static ua.lviv.yurii.zhurakovskyi.my.selection.committee.domain.Role.ROLE_USER;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest
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
    }

}
