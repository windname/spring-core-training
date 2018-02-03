package cf.spring.core.ex4;

/**
 * @author vgrigoriev - 1/23/2018
 */
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void cashWithdraw(float amount) {
        System.out.println("Withdraw ver4: " + amount);
    }
}
