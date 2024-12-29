package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "yellow")
    public Desktop desktop(){
        System.out.println("From config class");
        return new Desktop();
    }
}
