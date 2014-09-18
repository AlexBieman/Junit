package Gifts;

public class Envelope implements Comparable<Object>{
	private Integer pennies,nickels,dimes,quarters,dollars,total;
	
	public Envelope(){
		setPennies(0);
		setNickels(0);
		setDimes(0);
		setQuarters(0);
		setDollars(0);
		total = 0;
	}

	@Override
	public int compareTo(Object arg0) throws ClassCastException{
		if (!(arg0 instanceof Envelope)){
			throw new ClassCastException("Envelope object expected.");
		}
		if (this.pennies.equals(((Envelope) arg0).getPennies()) && this.nickels.equals(((Envelope) arg0).getNickels()) && this.dimes.equals(((Envelope) arg0).getDimes()) && this.quarters.equals(((Envelope) arg0).getQuarters()) && this.dollars.equals(((Envelope) arg0).getDollars()) ) {
			return 0;
		}
		return 1;
	}
	
	public void addPenny(int i){
		setPennies(getPennies() + i);
		total+=i;
	}
	
	public void addNickel(int i) {
		setNickels(getNickels() + i);
		total+=5*i;
	}

	public void addDime(int i) {
		setDimes(getDimes() + i);
		total+=10*i;
	}

	public void addQuarter(int i) {
		setQuarters(getQuarters() + i);
		total+=25*i;
	}
	public void addDollar(int i) {
		setDollars(getDollars() + i);
		total+=100*i;
	}

	public int getTotal() {
		return total;
	}

	private int getPennies() {
		return pennies;
	}

	private void setPennies(int pennies) {
		this.pennies = pennies;
	}

	public int getNickels() {
		return nickels;
	}

	public void setNickels(int nickels) {
		this.nickels = nickels;
	}

	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getQuarters() {
		return quarters;
	}

	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}

	public int getDollars() {
		return dollars;
	}

	public void setDollars(int dollars) {
		this.dollars = dollars;
	}
}
