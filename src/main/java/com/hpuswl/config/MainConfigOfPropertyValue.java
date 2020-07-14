package com.hpuswl.config;

import com.hpuswl.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:/user.properties")
@Configuration
public class MainConfigOfPropertyValue {

    @Bean
    public User user(){
        return new User();
    }
}
