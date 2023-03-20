import com.kuang.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /**
     *  控制反转(彻底不需要改动程序，只需要更改xml配置文件就行，对象由Spring来创建、管理、装配)
     *      1. 对象是Spring创建的
     *      2. 对象的属性是由Spring容器设置的
     */
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        // 我们的对象现在都在Spring中管理了，我们要使用，直接从里面取出来即可
        UserDaoImpl userDaoImpl = (UserDaoImpl)context.getBean("userDaoImpl");
        // 测试
        System.out.println(userDaoImpl.toString());
    }
}
