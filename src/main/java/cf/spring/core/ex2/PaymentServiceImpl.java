package cf.spring.core.ex2;

import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void cashWithdraw(float amount) {
        System.out.println("Withdraw money: " + amount);
    }
}
