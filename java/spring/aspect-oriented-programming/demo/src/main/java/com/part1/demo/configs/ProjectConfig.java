package com.part1.demo.configs;



import com.part1.demo.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
