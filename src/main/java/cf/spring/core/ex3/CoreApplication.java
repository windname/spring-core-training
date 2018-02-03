package cf.spring.core.ex3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);
		BookService service = (BookService)ctx.getBean("BookService3");
		service.buyBook();
	}
}
