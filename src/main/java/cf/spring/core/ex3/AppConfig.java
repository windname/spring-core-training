package cf.spring.core.ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vgrigoriev - 1/23/2018
 */
@Configuration
public class AppConfig {
    @Bean("BookService3")
    public BookService getBookService() {
        return new BookService();
    }

    @Bean
    public PaymentService getPaymentService() {
        return  new PaymentServiceImpl();
    }
}
