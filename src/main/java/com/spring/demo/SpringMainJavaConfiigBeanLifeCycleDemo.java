package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringMainJavaConfiigBeanLifeCycleDemo {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new AnnotationConfigApplicationContext(SpringConfigLifeCycle.class);
        Triangle triangle = beanFactory.getBean(Triangle.class);
        System.out.println(triangle);
    }
}
