package com.home.UserInterceptorWithSpringRestAPI.configuration;

import com.home.UserInterceptorWithSpringRestAPI.interceptors.Log1Interceptor;
import com.home.UserInterceptorWithSpringRestAPI.interceptors.Log2Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer
{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new Log1Interceptor());
       registry.addInterceptor(new Log2Interceptor())
             .addPathPatterns("/api/demo2/*")
             .excludePathPatterns("/api/demo2/hello");

    }
}
