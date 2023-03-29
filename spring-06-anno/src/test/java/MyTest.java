import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        // 配置Spring上下文（Spring容器）
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 获取Bean对象
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);

        // 测试
        System.out.println(user == user2);
//        System.out.println(user.getName());
    }
}
