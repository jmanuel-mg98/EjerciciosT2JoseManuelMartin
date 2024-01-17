package ejerciciosBucles;

import java.util.Scanner;

public class Ejercice5 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Escribe un numero: ");
	        int num1 = Math.abs(scanner.nextInt());
	        System.out.print("Escribe otro numero: ");
	        int num2 = Math.abs(scanner.nextInt());  
	        int mcm = ( num1 > num2) ? num1 : num2;
	        while (mcm % num1 != 0 || mcm % num2 != 0) {
	            mcm++;
	        }
	        System.out.println("El mínimo común múltiplo (MCM) de " + num1 + " y " + num2 + " es: " + mcm);
	    }
	}
