package interfaces;

import java.security.InvalidParameterException;

public interface InterestService {
	Double getInterestRate();
	
	default Double payment(double amount, int months) throws InvalidParameterException {
		if(months < 1) {
			throw new InvalidParameterException("Meses precisa ser maior que zero");
		}
		return amount * Math.pow(1 + getInterestRate() / 100, months);
	}
}
