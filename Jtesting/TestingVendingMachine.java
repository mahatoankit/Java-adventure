import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingVendingMachine {
	VendingMachine abc = new VendingMachine();
	@Test
	void test() {
		abc.insertCoin();
		abc.insertCoin();
		assertEquals(2, abc.getBalance());
	}
	
	@Test
	void testingReFund() {
		abc.insertCoin();
//abc.insertCoin();
		assertEquals(1, abc.getBalance());
	}
}
