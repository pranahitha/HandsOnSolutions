package handson15july;

import java.util.Comparator;

public class PaymentComparator implements Comparator<Payment> {

	@Override
	public int compare(Payment o1, Payment o2) {
		if(o1.getPaymentId()>o2.getPaymentId())
			return 1;
		else
			return -1;
	}
	
}
