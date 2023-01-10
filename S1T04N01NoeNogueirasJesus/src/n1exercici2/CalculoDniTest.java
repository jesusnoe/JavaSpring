package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


class CalculoDniTest {

	@Test
	void test() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(38823862);
		list.add(35107297);
		list.add(37994036);
		list.add(40987732);
		list.add(24140622);
		list.add(13680033);
		list.add(72090792);
		list.add(62446172);
		list.add(54386210);
		list.add(67730665);

		
		CalculoDni dni = new CalculoDni();
		
		for (int number : list) {
			System.out.print(number + "-");
			System.out.print(dni.calculLletra(number));
			System.out.println();
		}
	}

}
