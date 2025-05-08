package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double convertDollarToReal(double priceDollar, double priceBuy) {
		double total = priceDollar * priceBuy;
		double amount = total + (total * IOF);
		return amount;
	}
}
