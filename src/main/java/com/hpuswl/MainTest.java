package com.hpuswl;

import com.hpuswl.config.MainConfig;
import com.hpuswl.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);*/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        /*String[] namesForType = applicationContext.getBeanNamesForType(Person.class);

        for (String name: namesForType) {
            System.out.println(name);
        }*/

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name: definitionNames){
            System.out.println(name);
        }
    }
}
