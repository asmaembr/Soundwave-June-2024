package ma.soundwave.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({ "ma.soundwave.usercontext.repository",
        "ma.soundwave.catalogcontext.repository" })
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}
