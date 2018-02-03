package cf.spring.core.ex5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);
		BookService service = (BookService)ctx.getBean("BookService5");
		service.buyBook(ctx.getBean(Promotion.class));
		service.buyBook(ctx.getBean(Promotion.class));
	}
}
