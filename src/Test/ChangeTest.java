package Test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import Gifts.Cashier;
import Gifts.Envelope;
import Gifts.NegativeBalanceException;

public class ChangeTest {
	static Envelope testEnvelope;
	static Cashier testCashier;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Envelope testEnvelope = new Envelope();
		testEnvelope.addQuarter(2);
		testEnvelope.addDime(1);
		testEnvelope.addNickel(1);
		Cashier testCashier = new Cashier();
	}
	
	@Test
	public void test() throws NegativeBalanceException {
		Envelope expected = new Envelope();
		expected.addDime(2);
		Envelope actual = testCashier.getChange(0,45,testEnvelope);
		Assert.assertEquals(expected, actual);
	}

	@Test (expected = NegativeBalanceException.class)
	public void testNegativeBalance() throws NegativeBalanceException {
		Envelope actual = testCashier.getChange(0,66,testEnvelope);
	}
}
