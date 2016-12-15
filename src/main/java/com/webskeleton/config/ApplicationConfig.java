package com.webskeleton.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by taqmuq on 30/03/2016.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.webskeleton.backend.persistence.repositories")
@EntityScan(basePackages = "com.webskeleton.backend.persistence.domain.backend")
@EnableTransactionManagement
@PropertySource("file:///${user.home}/Learn/Taqmuq/github/.webskeleton/application-common.properties")
public class ApplicationConfig {
}