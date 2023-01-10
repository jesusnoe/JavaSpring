package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> main.main(null));
		
		// Si introduim un index fora del rang dona error
	}

}
