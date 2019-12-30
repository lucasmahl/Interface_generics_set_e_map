package services;

public class BrazilInterestService implements InterestService {
	private double interestRate; // taxa de juros

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	// n�o � possivel coloca-lo como padr�o pois depende do interestrate,
	// q � diferente pra cada classe
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
