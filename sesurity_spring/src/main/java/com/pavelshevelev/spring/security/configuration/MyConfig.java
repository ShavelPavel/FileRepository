package com.pavelshevelev.spring.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.pavelshevelev.spring.security")
@EnableWebMvc
public class MyConfig {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver=
                new InternalResourceViewResolver();
        internalResourceViewResolver.setSuffix("/WEB-INF/view/");
        internalResourceViewResolver.setPrefix(".jsp");

        return internalResourceViewResolver;
    }

}
