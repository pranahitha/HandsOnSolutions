package handson15july;

public class Payment{
	private String paymentType;
	private int paymentId;
	private int amount;
	private String status;
	
	public Payment()
	{
		
	}
	
	public Payment(String paymentType, int paymentId, int amount, String status) {
		super();
		this.paymentType = paymentType;
		this.paymentId = paymentId;
		this.amount = amount;
		this.status = status;
	}
	
	

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "\nPayment [paymentType=" + paymentType + ", paymentId=" + paymentId + ", amount=" + amount + ", status="
				+ status + "]";
	}
}

