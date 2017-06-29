package com.spring.demo;


import org.springframework.context.annotation.Bean;

public class SpringConfigLifeCycle {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    Triangle triangle() {
        Triangle triangle = new Triangle();
        triangle.setAltitude(23);
        triangle.setHeight(27);
        return triangle;
    }
}
