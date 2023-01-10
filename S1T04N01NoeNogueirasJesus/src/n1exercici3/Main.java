package n1exercici3;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] myArray = {897, 56, 78, 90, 12, 123, 75};
	    System.out.println("Elements a l'array: ");
	    System.out.println(Arrays.toString(myArray));
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Index de l'element que vols agafar?");
	    int element = sc.nextInt();
	    System.out.println("Has escollit el "+myArray[element]);
	}
}
