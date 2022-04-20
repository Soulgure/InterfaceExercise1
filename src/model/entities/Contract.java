package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private int number;
	private double totalValue;
	private Date date;
	
	private List<Installment> installments = new ArrayList<>();
	private Installment nOfInstallments;
	
	public Contract() {
	}
	
	public Contract(int number, double totalValue, Date date, Installment nOfInstallments) {
		this.number = number;
		this.totalValue = totalValue;
		this.date = date;
		this.nOfInstallments = nOfInstallments;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void removeInstallments(Installment installment) {
		installments.remove(installment);
	}

	public void addInstallments(Installment installment) {
		installments.add(installment);
	}

	public int getNOfInstallments() {
		return nOfInstallments.getnOfInstallments();
	}

	public void setNOfInstallments(Installment nOfInstallments) {
		this.nOfInstallments = nOfInstallments;
	}
	
	public void printInstallments() {
		for (Installment x : getInstallments()) {
			System.out.println(x);
		}

	}
	
	
	
}
