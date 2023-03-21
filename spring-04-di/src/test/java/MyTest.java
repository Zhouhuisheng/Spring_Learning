import com.kuang.pojo.Student;
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
}
