package handson12jul;


//HANDS ON 2 CALLING METHODS OF EACH CLASS OF DIFFERENT .CLASS FILES
public class Welcome {
	public static void main(String[] args) {
		System.out.println("Calling methods of various classes");
		Product p=new Product();
		p.productName();
		p.productId();
		OrderDetails o = new OrderDetails();
		o.orderDate();
		o.orderPlace();
		StockDetails d=new StockDetails();
		d.stockName();
		d.stockPlace();
		PaymentDetails pd=new PaymentDetails();
		pd.paymentView();
		pd.totalPaymentDetails();	
	}
}
class Product
{ 
	/*to get this class execute class must be public and in eclipse file name n class name must be same
	//if two classes with main gets executed in notepad cmd by cmd java Product(.class)
	but not in eclipse*/
	/*
	public static void main(String[] args) {
		Product p=new Product();
		
		p.productName();
		p.productId();	
	} */
	String productName1="mobile";
	int productID=10;
	public void productName()
	{
		System.out.println("The name of the product is "+productName1);
	}
	public void productId()
	{
		System.out.println("The product id of "+productName1+ " is "+productID);
	}

}
class OrderDetails
{
	String orderDate1="13-07-2021";
	public void orderDate()
	{
		System.out.println("The date of Order is "+orderDate1);
	}
	public void orderPlace()
	{
		System.out.println("The destination of order is Telangana");
	}
}
