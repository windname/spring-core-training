package cf.spring.core.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 * inject dependeny by type
 */
@Service("BookService2")
public class BookService {

    @Autowired
    private PaymentService paymentService;

    public void buyBook() {
        paymentService.cashWithdraw(200f);
        System.out.println("User baught a book");
    }

}
