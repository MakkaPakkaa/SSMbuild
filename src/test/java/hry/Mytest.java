package hry;

import com.hry.pojo.Books;
import com.hry.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {
    @Test
    public void test(){
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bean = (BookService) context.getBean("BookServiceImpl");
        List<Books> books = bean.queryAllBooks();
        for (Books book:books){
            System.out.println(book);

        }

    }
}
