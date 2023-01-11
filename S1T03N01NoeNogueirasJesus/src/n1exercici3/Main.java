package n1exercici3;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {

		// Save the country / capital list in a HashMap
		HashMap<String, String> countries = getCountries();
		
		// Ask user name
		String name = getName();
		
		// Play the game
		List<Integer> resultats = quiz(countries);
		
		// Thanks
		System.out.println("Gràcies per participar " + name);
		System.out.println("Has tingut " + resultats.get(0) + " encerts i " + resultats.get(1) + " errades" );
		
		// Write the file with results
		writeResults(name, resultats);
		
	}
	
	static void writeResults(String name, List<Integer> resultats) {
	    try {
	        FileWriter myFile = new FileWriter("C:\\Users\\web\\java-spring\\S1T03N01NoeNogueirasJesus\\src\\n1exercici3\\resultats.txt");
	        myFile.write(name + " has tingut " + resultats.get(0) + " encerts i " + resultats.get(1) + " errades");
	        myFile.close();
	        System.out.println("Resultats desats a resultats.txt");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
	static List<Integer> quiz( HashMap countries ) {
		
		int encerts = 0;
		int errades = 0;
		List<Integer> res = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
			// Generate a random index
			int size = countries.size();
	        int randIdx = new Random().nextInt(size);
	        
	        // City and corresponding capital
	        String countryName = countries.keySet().toArray()[randIdx].toString().replace("_"," ");
	        String capital = countries.get(countries.keySet().toArray()[randIdx]).toString().replace("_"," ");
	        
	        // Question
			System.out.println("Capital de " + countryName + "? ("+capital+")");
			
			// Get the answer
			Scanner sc = new Scanner(System.in);
	        String resposta = sc.nextLine();
	        
	        if(capital.replace(" ","").equalsIgnoreCase(resposta.replace(" ",""))) {
	        	encerts += 1;
	        	System.out.println("Que crack!");
	        } else {
	        	errades += 1;
	        	System.out.println("Nop... és " + capital);
	        }
	        
	        System.out.println();

		}
		
		return res = Arrays.asList(encerts, errades);
	}
	
	static String getName() {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el teu Nom: ");
        String name = sc.next();
		
		return name;
	}
	
	static HashMap getCountries() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		String file = "C:\\Users\\web\\java-spring\\S1T03N01NoeNogueirasJesus\\src\\n1exercici3\\countries.txt";
				
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			
			while ((line = br.readLine()) != null) {
				
				// Split the line by space
				String[] contents = line.split(" ");
				
				// Get country and city value pair
				String countryName = contents[0].trim();
                String capital = contents[1].trim();
                
                // If values not empty add to map countries
                if (!countryName.equals("") && !capital.equals(""))
                	map.put(countryName, capital);
			}
			
			//System.out.print(countries.getClass());
			
		} catch (Exception e) {
            e.printStackTrace();
        }
		return map;
	}
}
