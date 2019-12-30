package services;

public class BrazilInterestService implements InterestService {
	private double interestRate; // taxa de juros

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	// não é possivel coloca-lo como padrão pois depende do interestrate,
	// q é diferente pra cada classe
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
