package cf.spring.core.ex8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void cashWithdraw(float amount) {
        System.out.println("Withdraw " + amount);
    }

    public PaymentServiceImpl() {
        System.out.println("PaymentService constructor");
    }

    @PostConstruct
    private void init() {
        System.out.println("PaymentService post construct");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("PaymentService pre destroy");
    }

}
