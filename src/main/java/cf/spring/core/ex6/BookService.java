package cf.spring.core.ex6;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 * use properties file to read external configuration and use SPEL language
 */
@Service
public class BookService {
    @Autowired
    private PaymentService paymentService;

    @Value("${shop.name}")
    private String shopName;

    @Value("${promo.books}")
    private List<String> promoBooks;

    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private long randomPromo;

    public void buyBook() {
        paymentService.cashWithdraw(400f);
        System.out.println("We offer you promo books" + promoBooks);
        System.out.println("User has baugh a book from store:" + shopName);
        System.out.println("User has random number:" + randomPromo);

    }

}
