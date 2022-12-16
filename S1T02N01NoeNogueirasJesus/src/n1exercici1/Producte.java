package n1exercici1;

public class Producte {

	// Atributs
	public String nom;
	public double preu;
	
	// Constructor
	Producte(String nom, double preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	// Getters
	public String getNom() {
		return nom;
	}
	
	public double getPreu() {
		return preu;
	}
	
	@Override
	public String toString() {
		return 	">>> Nou producte: " 
				+ getNom() 
				+ ", Preu: " + getPreu()
				+ "€";
	}	
}
