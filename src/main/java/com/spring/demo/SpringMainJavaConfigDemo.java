package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainJavaConfigDemo {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new AnnotationConfigApplicationContext(SpringConfig.class);
        Triangle triangle = beanFactory.getBean(Triangle.class);
        System.out.println(triangle);
    }
}
