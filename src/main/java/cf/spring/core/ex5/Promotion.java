package cf.spring.core.ex5;

import java.time.LocalDate;
import java.time.Period;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author vgrigoriev - 1/24/2018
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Promotion {
    int discount = 0;
    public Promotion() {
        discount = Period.between(LocalDate.of(2018, 01, 01), LocalDate.now()).getDays();
    }
    public float getDiscount() {
        System.out.println("Reduce amount with:" + discount + " promotion id " + this);
        return discount;
    }
}
