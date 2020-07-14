package com.hpuswl.config;

import com.hpuswl.condition.LinuxCondition;
import com.hpuswl.condition.MacCondition;
import com.hpuswl.condition.WindowsCondition;
import com.hpuswl.bean.Color;
import com.hpuswl.bean.ColorFactoryBean;
import com.hpuswl.bean.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(value = "com.hpuswl",
//        excludeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
//        },
        includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = BookService.class)
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)
        },
        useDefaultFilters = false
)
//@Import(Color.class)
@Import({MyImportSelector.class, Color.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig {
    /**
     * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @return
     * scope
     *
     * prototype
     * singleton
     */
//    @Scope
    @Lazy
    @Bean
    public Person person() {
        return new Person("Jack", 11);
    }

    @Conditional(value = {WindowsCondition.class})
    @Bean("bill")
    public Person person_bill(){
        return new Person("bill", 68);
    }

    @Conditional(value = {LinuxCondition.class})
    @Bean("linus")
    public Person person_linus(){
        return new Person("linus", 41);
    }

    @Conditional(value = MacCondition.class)
    @Bean("jobs")
    public Person person_jobs(){
        return new Person("jobs", 72);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
