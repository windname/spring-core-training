package cf.spring.core.ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 */
@Service
@Profile("production")
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void cashWithdraw(float amount) {
        System.out.print("\n\n\n Withdraw " + amount + "\n");
    }
}
