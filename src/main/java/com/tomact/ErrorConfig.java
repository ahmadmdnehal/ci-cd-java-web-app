package com.tomact;

import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorConfig {

    // create the ErrorPageFilter bean so it can be injected
    @Bean
    public ErrorPageFilter errorPageFilter() {
        return new ErrorPageFilter();
    }

    @Bean
    public FilterRegistrationBean<ErrorPageFilter> disableErrorPageFilter(ErrorPageFilter filter) {
        FilterRegistrationBean<ErrorPageFilter> frb = new FilterRegistrationBean<>(filter);
        frb.setEnabled(false); // keep disabled if you want to disable it
        return frb;
    }
}
