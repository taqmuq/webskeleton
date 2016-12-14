package com.webskeleton.config;

import com.webskeleton.backend.service.EmailService;
import com.webskeleton.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by taqmuq on 21/03/2016.
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/Learn/Taqmuq/github/.webskeleton/application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}