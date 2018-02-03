package cf.spring.core.ex9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 * example of lyfe cycle for beans
 */
@Service
public class BookService {
    @Autowired
    private PaymentService paymentService;

    @BookLog
    public void buyBook() {
        paymentService.cashWithdraw(800f);
        System.out.println("User has baugh a book");
    }

}
