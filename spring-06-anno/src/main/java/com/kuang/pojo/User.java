package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *  @Component： 添加组件
 */
@Component  // 等价于 在配置文件中写 <bean name="user" class="com.kuang.pojo.User"></bean>
@Scope("prototype") //等价于 scope="prototype" 默认是singleton
public class User {
    @Value("小明")    // 等价于 <property name="name" value="小明"/>  注入在set方法上也是一样的，复杂的建议还是走配置文件
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
