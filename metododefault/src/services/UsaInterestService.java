package services;

public class UsaInterestService implements InterestService {
	private double interestRate; // taxa de juros

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	// não é possivel coloca-lo como padrão pois depende do interestrate,
	// q é diferente pra cada classe
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
