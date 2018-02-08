package cf.spring.core.ex5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);
		BookService service = (BookService)ctx.getBean("BookService");
		service.buyBook(ctx.getBean(Promotion.class));
		service.buyBook(ctx.getBean(Promotion.class));
	}

    @Bean("BookService")
    public BookService getBookService() {
        return new BookService();
    }

    @Bean
    public PaymentService getPaymentService() {
        return  new PaymentServiceImpl();
    }

}
