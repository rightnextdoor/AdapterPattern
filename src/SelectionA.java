import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionA {

	@Test
	void test() {
		CoffeeManhine test = new CoffeeManhine();
		String x = "A";
		String output = test.selection(x);
		
		assertEquals("A", output);
	}

	@Test
	void testSelectionB() {
		CoffeeManhine test = new CoffeeManhine();
		String x = "B";
		String output = test.selection(x);
		
		assertEquals("B", output);
	}
}
