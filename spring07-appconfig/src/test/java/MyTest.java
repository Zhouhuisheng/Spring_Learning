import com.kuang.config.MyConfig;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        // 如果完全使用配置类的方式来配置，我们就只能通过AnnotationConfig上下文获取Spring容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        // 获取Bean对象
        User user = context.getBean("getUser", User.class);

        // 测试
        System.out.println(user);
    }
}
