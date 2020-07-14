package com.hpuswl.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 使用JSR250
 *  @PostConstruct: 初始化
 *  @PreDestroy: 销毁
 */
@Component
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Dog() {
        System.out.println("Dog 创建完成...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog 初始化完成...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog 销毁完成...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
