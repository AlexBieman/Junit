package Gifts;

public class NegativeBalanceException extends Exception{
	public NegativeBalanceException(){
		super("Error, envelope does not have enough money to pay for item");
	}
}
