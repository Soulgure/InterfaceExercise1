package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.PayPalService;
import model.services.ProcessService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Enter contract data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter date (dd/MM/yyyy): ");
			Date date = sdf.parse(sc.nextLine());
			System.out.print("Value: ");
			double value = sc.nextDouble();
			System.out.print("Enter number of Installments: ");
			int nOfInstallments = sc.nextInt();

			Contract contract = new Contract(number, value, date, new Installment(nOfInstallments));

			ProcessService ProcessService = new ProcessService(new PayPalService());

			ProcessService.installmentProcess(contract);
			
			contract.printInstallments();

			
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
