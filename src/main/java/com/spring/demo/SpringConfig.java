package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan(basePackages = "com.spring.demo")
public class SpringConfig {

    @Bean
    Triangle triangle() {
        Triangle triangle = new Triangle();
        triangle.setAltitude(23);
        triangle.setHeight(27);
        return triangle;
    }

}
