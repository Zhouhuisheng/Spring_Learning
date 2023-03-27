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

    /**
     * 测试Bean作用域 Singleton（默认）
     */
    @Test
    public void testSingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user1 = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");

        // 测试
        System.out.println(user1 == user2); // true 表示两个对象是同一个
    }

    /**
     * 测试Bean作用域 Prototype（原型模式）
     */
    @Test
    public void testPrototype() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user1 = (User) context.getBean("user2");
        User user2 = (User) context.getBean("user2");

        // 测试
        System.out.println(user1 == user2); // false 表示两个对象不是同一个
    }
}
