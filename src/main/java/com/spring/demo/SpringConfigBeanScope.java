package com.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * Created by richa on 29/6/17.
 */
public class SpringConfigBeanScope {

    @Bean
    //@Scope("prototype")
    Triangle triangle() {
        Triangle triangle = new Triangle();
        triangle.setAltitude(23);
        triangle.setHeight(27);
        return triangle;
    }
}
