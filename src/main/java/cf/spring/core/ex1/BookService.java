package cf.spring.core.ex1;

import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 * Annotate Class with service stereotype and find it in context by qualifier name
 */
@Service("BookService")
public class BookService {
    public void buyBook() {
        System.out.println("User baught a book");
    }
}
