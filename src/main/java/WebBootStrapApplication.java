import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan({"com.kachadi.web.domain"})
@EnableJpaRepositories({"com.kachadi.web.repo"})
@ComponentScan({"com.kachadi"})
@SpringBootApplication
public class WebBootStrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebBootStrapApplication.class, args);
    }
}