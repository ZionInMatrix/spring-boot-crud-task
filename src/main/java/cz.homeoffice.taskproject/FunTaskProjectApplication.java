package cz.homeoffice.taskproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableJpaRepositories
public class FunTaskProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunTaskProjectApplication.class, args);
    }
}
