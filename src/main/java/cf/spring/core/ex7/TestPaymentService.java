package cf.spring.core.ex7;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/25/2018
 */
@Service
@Profile("testing")
public class TestPaymentService implements PaymentService {

    @Override
    public void cashWithdraw(float amount) {
        System.out.println("Cash withdraw in training mode");
    }
}
