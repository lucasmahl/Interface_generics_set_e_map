package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Entre com os dados de aluguel: ");
		System.out.print("Modelo de carro: ");
		String carModel = sc.nextLine();

		System.out.print("Data que saiu (dd/MM/yyyy HH:ss): ");
		Date start = sdf.parse(sc.nextLine());

		System.out.print("Data de entrega (dd/MM/yyyy HH:ss): ");
		Date finish = sdf.parse(sc.nextLine());

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Preço por hora: ");
		double precoHora = sc.nextDouble();

		System.out.print("Preço por dia: ");
		double precoDia = sc.nextDouble();

		RentalService rs = new RentalService(precoDia, precoHora, new BrazilTaxService());

		rs.processInvoice(cr);
		
		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		
		sc.close();

	}

}
