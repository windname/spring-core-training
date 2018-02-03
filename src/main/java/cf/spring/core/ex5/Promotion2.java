package cf.spring.core.ex5;

import java.time.LocalDate;
import java.time.Period;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author vgrigoriev - 1/23/2018
 * this class allows to return new instance even if it's injected into singleton bean
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Promotion2 {
    int discount = 0;
    public Promotion2() {
        discount = Period.between(LocalDate.of(2018, 01, 01), LocalDate.now()).getDays();
    }
    public float getDiscount() {
        System.out.println("Reduce amount with:" + discount + " promotion id " + this);
        return discount;
    }
}
