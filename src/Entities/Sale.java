package Entities;

public class Sale {
	private int billingNumber = 0;
	private double subtotalFee = 0;
	
	public int getBillingNumber() {
		return billingNumber;
	}

	public void setBillingNumber(int billingNumber) {
		this.billingNumber = billingNumber;
	}

	public double getSubtotalFee() {
		return subtotalFee;
	}

	public void setSubtotalFee(double subtotalFee) {
		this.subtotalFee = subtotalFee;
	}
}
