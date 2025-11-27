package com.tomact;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean<org.springframework.boot.web.servlet.support.ErrorPageFilter> disableErrorPageFilter(ErrorPageFilter filter) {
        FilterRegistrationBean<org.springframework.boot.web.servlet.support.ErrorPageFilter> registration = new FilterRegistrationBean<>(filter);
        registration.setEnabled(false);
        return registration;
    }
}
