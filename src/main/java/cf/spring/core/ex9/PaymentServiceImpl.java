package cf.spring.core.ex9;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

}
