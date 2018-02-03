package cf.spring.core.ex5;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author vgrigoriev - 1/23/2018
 * Bean scope example (prototype, singleton, session, etc)
 */
public class BookService {
    @Autowired
    private PaymentService paymentService;

    public void buyBook(Promotion promotion) {
        promotion.getDiscount();
        paymentService.cashWithdraw(300f);
        System.out.println("User has baugh the book");

    }
}
