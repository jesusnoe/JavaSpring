package n1exercici1;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Hello wordl \n");
		
		final List<String> year = new ArrayList<String>();
		
		final List<String> ListOfMonths = new ArrayList<>(List.of("January","February","March","April","May","June","July","September","October","November","December"));
	
		for( String monthName : ListOfMonths) {
			Month MonthToAdd = new Month(monthName);
			year.add(MonthToAdd.getName());
		}
				
		// Adding August in the 8th position starting from 0
		Month aug = new Month("August");
		year.add(7,aug.getName());
		
		// Create a HashSet
		Set<String> hashSet = new LinkedHashSet<String>(year);
		
		// Print
		for (String value : hashSet) {
            System.out.println(value);
        }

		
	}
}
