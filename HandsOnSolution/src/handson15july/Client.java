package handson15july;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Payment> payment1=new ArrayList<Payment>();
		payment1.add(new Payment("debit",5,54500,"a"));
		payment1.add(new Payment("debit",4,500,"c"));
		payment1.add(new Payment("deposit",15,3500000,"d"));
		payment1.add(new Payment("credit",42,1400,"b"));
		payment1.add(new Payment("credit",3,4000,"e"));
		System.out.println(payment1);
		
		//sort by paymentType by using Comparator anonymous class
		Collections.sort(payment1,new Comparator<Payment>()
				{

					@Override
					public int compare(Payment o1, Payment o2) {
						if(o1.getPaymentType().compareTo(o2.getPaymentType())>0)
							return 1;
						else
							return -1;
					}
			
				});
		
		System.out.println(payment1);
		//sort by paymentId
		Collections.sort(payment1,new PaymentComparator());//paymentComparator to implement paymentId
		System.out.println(payment1);
		//sort by amount
		System.out.println("amount sort: ");
		Collections.sort(payment1,new Comparator<Payment>()
				{
			@Override
			public int compare(Payment o1, Payment o2) {
					if(o1.getAmount()>o2.getAmount())
						return 1;
					else
						return -1;
				}
			
				});
		
		System.out.println(payment1);
		
		//sort by status
		Collections.sort(payment1,new Comparator<Payment>()
		{

			@Override
			public int compare(Payment o1, Payment o2) {
				if(o1.getStatus().compareTo(o2.getStatus())>0)
					return -1;
				else
					return 1;
			}
	
		});

		System.out.println(payment1);
	}
}
