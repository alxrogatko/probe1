package by.rogatko.alx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("by.rogatko.alx.repository")

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
