package com.hpuswl.bean;

public class Car {

    public Car() {
        System.out.println("car 创建完成...");
    }

    public void init(){
        System.out.println("car 初始化完成...");
    }

    public void destroy(){
        System.out.println("car 销毁完成...");
    }
}
