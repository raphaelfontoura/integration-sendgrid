package com.rddeveloper.integrations.config;

import com.rddeveloper.integrations.services.EmailService;
import com.rddeveloper.integrations.services.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
