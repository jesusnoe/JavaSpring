package n1exercici1;
import java.util.ArrayList;
import java.util.List;

public class Months {
	public List<String> list = new ArrayList<>(List.of("January","February","March","April","May","June","July","August","September","October","November","December"));
	
	public void print() {
		for ( String month : list) {
			System.out.println(month);
		}		
	}
}
