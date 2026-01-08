package pixel.academy.date.and.time.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pixel.academy.date.and.time.service.TimeService;
import pixel.academy.date.and.time.service.TimeServiceImp;

@Configuration
public class AppConfig {

    @Bean
    TimeService timeService() {
        return new TimeServiceImp();
    }
}
