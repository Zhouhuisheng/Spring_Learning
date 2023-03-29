package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration: 这个也会被Spring容器托管，注册到容器中，因为他也是一个@Component
@Configuration  //  @Configuration：代表这个类是一个配置类，和beans.xml一样的
@ComponentScan("com.kuang.pojo")    // 因为这是一个配置类，可以指定扫描的包
public class MyConfig {

    /**
     *  注册一个bean，就相当于我们在beans.xml中写的一个 <bean></bean> 标签
     *  方法的名字 -- bean标签中的id
     *  方法的返回值 -- bean标签中的class
     */
    @Bean
    public User getUser() {
        return new User();  // 返回要注入到bean的对象
    }
}
