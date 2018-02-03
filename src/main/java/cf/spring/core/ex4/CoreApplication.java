package cf.spring.core.ex4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:/cf/spring/core/ex4/applicationContext.xml"})
public class CoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);
		BookService service = (BookService)ctx.getBean("BookService4");
		service.buyBook();
	}
}
