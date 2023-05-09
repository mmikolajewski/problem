package pl.javastart.springdataintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringdataintroApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringdataintroApplication.class, args);
        UserRepository bean = context.getBean(UserRepository.class);
    }

}
