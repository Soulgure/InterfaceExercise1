package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ProcessService {

	private OnlinePaymentServices OnlinePaymentService;

	public ProcessService(OnlinePaymentServices onlinePaymentService) {
		OnlinePaymentService = onlinePaymentService;
	}

	public void installmentProcess(Contract contract) {
		double basicQuota = contract.getTotalValue() / contract.getNOfInstallments();
		for (int i = 1; i <= contract.getNOfInstallments(); i++) {
			Date dueDate = addMonths(contract.getDate(), i);
			double updatedQuota = basicQuota + OnlinePaymentService.paymentFee(basicQuota);
			double fullQuota = updatedQuota + OnlinePaymentService.interest(i, updatedQuota);
			contract.addInstallments(new Installment(fullQuota, dueDate));
		}
	}

	public Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
