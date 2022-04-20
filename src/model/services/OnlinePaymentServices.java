package model.services;

import java.util.Date;

public interface OnlinePaymentServices {
	double paymentFee(double amount);
	double interest(int months, double amount);
}
