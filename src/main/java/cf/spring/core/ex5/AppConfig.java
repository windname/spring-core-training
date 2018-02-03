package cf.spring.core.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author vgrigoriev - 1/23/2018
 */
@Configuration
public class AppConfig {
    @Bean("BookService5")
    public BookService getBookService() {
        return new BookService();
    }

    @Bean
    public PaymentService getPaymentService() {
        return  new PaymentServiceImpl();
    }

//    @Bean
//    @Scope("prototype")
//    public Promotion2 getPromotion() {
//        return new Promotion2();
//    }
}
