package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by richa on 29/6/17.
 */
public class SpringMainJavaConfigBeanScopeDemo {

    public static void main(String[] args) {
        ApplicationContext beanFactory = new AnnotationConfigApplicationContext(SpringConfigBeanScope.class);
        System.out.println(beanFactory.getBean(Triangle.class));
        System.out.println(beanFactory.getBean(Triangle.class));
    }
}
