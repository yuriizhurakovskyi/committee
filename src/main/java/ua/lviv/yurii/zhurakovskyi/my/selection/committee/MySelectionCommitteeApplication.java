package ua.lviv.yurii.zhurakovskyi.my.selection.committee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"ua.lviv.yurii.zhurakovskyi.my.selection"})
public class MySelectionCommitteeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySelectionCommitteeApplication.class, args);
    }
}
