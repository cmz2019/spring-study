import com.strawberry.dao.UserDaoMySQLImpl;
import com.strawberry.pojo.Hello;
import com.strawberry.service.UserService;
import com.strawberry.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        Hello hello2 = (Hello) context.getBean("hello");
        hello.show();
        System.out.println(hello == hello2);
    }
}
