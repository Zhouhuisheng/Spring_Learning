import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /**
     *  控制反转(彻底不需要改动程序，只需要更改xml配置文件就行，对象由Spring来创建、管理、装配)
     *      1. 对象是Spring创建的
     *      2. 对象的属性是由Spring容器设置的
     */
    public static void main(String[] args) {
        // 获取ApplicationContext: 拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 容器在手，需要什么就get什么
        User user = (User)context.getBean("u3");
        // 测试
        System.out.println(user.toString());
    }
}
