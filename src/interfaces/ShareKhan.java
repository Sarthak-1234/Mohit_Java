package interfaces;

public class ShareKhan implements SEBI{

	@Override
	public void rateOfBrokerage() {
		System.out.println("Rate of Brokerage = +0.8");
	}

	@Override
	public void minQuantity() {
		System.out.println("Min = 1 Lakh");
	}
	
	
	
	//inheritance ----extends
	//interface -----implements

}
