package interfaces;

public class Zerodha implements SEBI{

	@Override
	public void rateOfBrokerage() {
		System.out.println("Rate = 0.3");
	}

	@Override
	public void minQuantity() {
		System.out.println("10 Lakh");
	}

}
