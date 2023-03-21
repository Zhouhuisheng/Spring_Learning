import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        // 获取上下文（Spring容器）
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取实例
        Student student = (Student)context.getBean("student");

        // 测试
        System.out.println(student.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user");

        // 测试
        System.out.println(user.toString());
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) context.getBean("user2");

        // 测试
        System.out.println(user.toString());
    }
}
