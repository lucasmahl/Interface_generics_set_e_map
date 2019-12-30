package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;

	// associa com o TaxService
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		// getTime pega o valor em milisegundos da data
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();

		// dividindo por mil converte de milisegundos pra segundo
		// por 60, converte pra minutos
		// por 60, novamente, pra horas
		double hours = (double) (t2 - t1) / 1000 / 60 / 60;

		double basicPayment;
		if (hours <= 12.0) {
			// math.ceil pra arredondar pra cima
			basicPayment = Math.ceil(hours) * pricePerHour;

		} else {
			// dividido por 24 pra achar a qtde em dias
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}

		// calcula o valor do imposto
		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

}
