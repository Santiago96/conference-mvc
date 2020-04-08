package com.pluralsight.conference;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ConfigurationConfig {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/jsp/");
        bean.setSuffix(".jsp");
        bean.setOrder(0);

        return bean;
    }
}
