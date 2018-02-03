package cf.spring.core.ex5;

/**
 * @author vgrigoriev - 1/23/2018
 */
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void cashWithdraw(float amount) {
        System.out.println("Withdraw money ver5: " + amount);
    }
}
