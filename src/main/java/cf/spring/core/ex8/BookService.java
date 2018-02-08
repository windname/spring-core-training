package cf.spring.core.ex8;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 * example of lyfe cycle for beans
 */
@Service
@Lazy
public class BookService {
    @Autowired
    private PaymentService paymentService;

    public BookService() {
        System.out.println("init Book service");
    }

    public void buyBook() {
        paymentService.cashWithdraw(800f);
        System.out.println("User has baugh a book");
    }

}
