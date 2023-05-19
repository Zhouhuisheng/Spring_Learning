import cn.huishengzhou.service.UserService;
import cn.huishengzhou.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        // 获取上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取Bean对象
        UserService userService = (UserService)context.getBean("userService");

        // 执行方法
        userService.add();
    }
}
