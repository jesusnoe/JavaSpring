package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthsTest {

	@Test
	void test() {
		Months month = new Months();
		
		// Comprovem que tingui 12 posicions
		assertTrue(month.list.size() == 12);
		// Comprovem que a la posició 8 conté 'august'
		assertTrue(month.list.get(7) == "August");
	}

}
