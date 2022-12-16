package n1exercici1;

public class Main {
	public static void main(String args[]) {
		System.out.println("Hello world!");
		System.out.println();
		
		Venda venda = new Venda();
		
		
		// Mirem si hi ha productes a la llista
		checkVenda(venda);
		
		System.out.println();
		
		// Creeem i afegim dos productes a la llista
		Producte prod1 = new Producte("wii", 150.00);
		Producte prod2 = new Producte("smart watch", 99.50);
		
		System.out.println(prod1.toString());
		System.out.println(prod2.toString());
		
		venda.productes.add(prod1);
		venda.productes.add(prod2);
		
		System.out.println();
		
		//System.out.println(venda.productes.size());
		
		// Mirem llista i printem total
		checkVenda(venda);

		
	}
	
	static void checkVenda(Venda venda) {
		try {
			if(venda.productes.size() > 0) {
				System.out.println("Hi ha " + venda.productes.size() + " productes al cistell");
				venda.calcularTotal();
			} else {
				throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
			}
		} catch(VendaBuidaException e) {
			System.out.println(e.getMessage());
		}
	}
}
