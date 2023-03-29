package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
    /**
     * @Autowired 可以在属性上使用 也可以在set方法上使用
     * 使用注解实现自动装配可以不写set方法 因为原理是用反射实现的
     */
    @Autowired
    @Qualifier(value = "cat1")
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }
}
