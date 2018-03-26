
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * User: weimeng
 * Date: 2018/3/26 14:04
 */
public class ServletInitalizer extends SpringBootServletInitializer {
    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(WebBootStrapApplication.class);
    }
}