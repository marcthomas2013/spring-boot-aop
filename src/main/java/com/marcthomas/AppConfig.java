package com.marcthomas;

import com.marcthomas.aop.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * This is required to initialise AspectJ
 */
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean
    public LoggingAspect myAspect() {
        return new LoggingAspect();
    }
}
