package com.hpuswl.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private Integer age;
}


