package n1exercici1;
import java.util.ArrayList;

public class Venda {

	public ArrayList<Producte> productes = new ArrayList<Producte>();
	
	public double total;

	public void calcularTotal() {
		for (Producte p:productes) {
			total += p.preu;
		}
		
		System.out.println("TOTAL: " + total + "€");
	}
}
