package cf.spring.core.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author vgrigoriev - 1/23/2018
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    @Qualifier("shopName")
    String shopName;

    @Override
    public void cashWithdraw(float amount) {
        System.out.println("Withdraw " + amount + " based on request from:" + shopName);
    }
}
