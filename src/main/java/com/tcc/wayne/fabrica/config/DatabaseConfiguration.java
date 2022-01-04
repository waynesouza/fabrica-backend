package com.tcc.wayne.fabrica.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.tcc.wayne.fabrica.repository")
@Configuration
@EnableTransactionManagement
public class DatabaseConfiguration {
}
