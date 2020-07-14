package com.hpuswl.test;

import com.hpuswl.bean.User;
import com.hpuswl.config.MainConfig;
import com.hpuswl.config.MainConfigOfLifeCycle;
import com.hpuswl.bean.Person;
import com.hpuswl.config.MainConfigOfPropertyValue;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.StandardEnvironment;

import java.util.Map;

@Slf4j
public class IOCTest {

    @Test
    public  void testOfPropertyValue(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
        applicationContext.close();
    }

    @Test
    public  void testOfLifeCycle(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

        applicationContext.close();
    }

    @Test
    public void test03(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
        }

        StandardEnvironment environment = (StandardEnvironment) applicationContext.getEnvironment();
        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
        System.out.println("==============================systemEnvironment==========================================");
        systemEnvironment.forEach((key, value) -> {
            System.out.println("key:"+key+ ", value:" + value.toString());
        });
        Map<String, Object> systemProperties = environment.getSystemProperties();
        System.out.println("==============================systemProperties==========================================");
        systemProperties.forEach((key, value) -> {
            System.out.println("key:"+key+ ", value:" + value.toString());
        });
    }

    @Test
    public void test01() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
