package model.services;

public class PayPalService implements OnlinePaymentServices {

	private static final double PAYMENT_FEE = 0.02;
	private static final double INTEREST_MONTHLY = 0.01;

	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(int months, double amount) {
		return amount * INTEREST_MONTHLY * months;
	}
}
