package boot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("usecase")
@ComponentScan("domain")
public class AppConfig {
}
