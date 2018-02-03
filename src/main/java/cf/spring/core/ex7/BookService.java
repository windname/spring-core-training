package cf.spring.core.ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 * use profiles to define test beans
 */
@Service
public class BookService {
    @Autowired
    private PaymentService paymentService;

    @Autowired
    Environment env;

    public void buyBook() {
        paymentService.cashWithdraw(400f);
        System.out.println("User baught a book");
        String[]  active = env.getActiveProfiles();
        String[]  def = env.getDefaultProfiles();

    }

}
