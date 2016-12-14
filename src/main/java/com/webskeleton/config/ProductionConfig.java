package com.webskeleton.config;

import com.webskeleton.backend.service.EmailService;
import com.webskeleton.backend.service.SmtpEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by taqmuq on 21/03/2016.
 */
@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/Learn/Taqmuq/github/.webskeleton/application-prod.properties")
public class ProductionConfig {

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }
}