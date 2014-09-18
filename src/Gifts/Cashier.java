package Gifts;

public class Cashier {

	public Envelope getChange(int i, int j, Envelope in) throws NegativeBalanceException {
		Integer change = i*100+j-in.getTotal();
		if (change < 0){ throw new NegativeBalanceException(); }
		int dollars = change/100;
		change = change%100;
		int quarters = change/25;
		change = change%25;
		int dimes = change/10;
		change = change%10;
		int nickels = change/5;
		int pennies = change%5;
		Envelope out = new Envelope();
		out.addPenny(pennies);
		out.addNickel(nickels);
		out.addDime(dimes);
		out.addQuarter(quarters);
		out.addDollar(dollars);
		return out;
	}
}
