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
public class User {

    @Value("张三")
    private String username;
    @Value("#{20-2}")
    private Integer age;
    @Value("${user.nickName}")
    private String nickName;
}
