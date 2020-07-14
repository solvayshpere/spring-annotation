package com.hpuswl.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat() {
        System.out.println("Cat创建完成...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Cat 销毁完成...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat 初始化完成...");
    }
}
