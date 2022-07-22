import com.pojo.Books;
import com.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);
        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }

    }
}
