package cf.spring.core.ex3;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author vgrigoriev - 1/23/2018
 * Make configuration with java code
 */
public class BookService {
    @Autowired
    private PaymentService paymentService;

    public void buyBook() {
        paymentService.cashWithdraw(300f);
        System.out.print("User baught a book");
    }

}
