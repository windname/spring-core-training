package cf.spring.core.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CoreApplication {

	@Autowired
	Environment env;

	@Bean("shopName")
	public String getShipName() {
		return env.getProperty("shop.name");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);
		BookService service = (BookService)ctx.getBean(BookService.class);
		service.buyBook();
	}

}
