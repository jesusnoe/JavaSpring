package n2exercici1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		// Declarem nou telèfon	
		Smartphone xiaomi = new Smartphone();
		
		// Cridem a mètode trucar
		xiaomi.trucar("670092678");
		
		// Cridem interficies
		xiaomi.fotografiar();
		xiaomi.alarma();
	}
}
