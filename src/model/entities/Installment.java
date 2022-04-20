package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	private double value;
	private Date date;
	private int nOfInstallments;

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Installment(int nOfInstallments) {
		this.nOfInstallments = nOfInstallments;
	}

	public Installment(double value, Date date) {
		this.value = value;
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getnOfInstallments() {
		return nOfInstallments;
	}

	public void setnOfInstallments(int nOfInstallments) {
		this.nOfInstallments = nOfInstallments;
	}

	public String toString() {
		return sdf.format(date) + " - " + getValue();
	}

}
