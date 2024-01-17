package ejerciciosBucles;

import java.util.Scanner;

public class Ejercice2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Escribe un número: ");
	        int n = scanner.nextInt();
	        int contadorPrimos = 0;
	        for (int i = 2; i <= n; i++) {
	            boolean esPrimo = true;

	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    esPrimo = false;
	                    break;
	                }
	            }

	            if (esPrimo) {
	                contadorPrimos++;
	            }
	        }

	        System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + n + ".");
	    }
	}
