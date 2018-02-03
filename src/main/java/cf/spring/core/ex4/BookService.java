package cf.spring.core.ex4;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author vgrigoriev - 1/23/2018
 * XML spring configuration
 */
public class BookService {
    @Autowired
    private PaymentService paymentService;

    public void buyBook() {
        paymentService.cashWithdraw(400f);
        System.out.println("User baught a book");
    }

}
