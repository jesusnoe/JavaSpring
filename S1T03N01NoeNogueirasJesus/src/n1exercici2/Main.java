package n1exercici2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> llista = new ArrayList<>();
		List<Integer> llistaInversa = new ArrayList<>();
		ListIterator<Integer> iterator = null;
		
		Collections.addAll(llista, 1, 2, 3, 4, 5);
		System.out.println(llista);
		
		iterator = llista.listIterator();
		
		while(iterator.hasNext()) {
			llistaInversa.add(0,iterator.next());
			//System.out.print(iterator.next());
		}
		
		System.out.println(llistaInversa);
		
		
	}
}
