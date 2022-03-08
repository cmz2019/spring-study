import com.strawberry.pojo.Books;
import com.strawberry.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        for (Books book : bookServiceImpl.queryAllBooks()) {
            System.out.println(book);
        }
    }

    @Test
    public void sqlTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        Books book = bookServiceImpl.queryBookById(1);
        System.out.println(book);
    }
}
