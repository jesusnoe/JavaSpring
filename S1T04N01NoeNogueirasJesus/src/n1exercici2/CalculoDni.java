package n1exercici2;

import java.util.ArrayList;
import java.util.Scanner;


public class CalculoDni {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el teu DNI sense lletra: ");
        int numDNI = sc.nextInt();
        System.out.println("La lletra que correspon a " + numDNI + " es " + calculLletra(numDNI));
        sc.close();
   }

   public static char calculLletra(int dni){
        String lletres="TRWAGMYFPDXBNJZSQVHLCKE";
        int quocient = dni%23;
        return lletres.charAt(quocient);
   }
}
