package ejerciciosBucles;

import java.util.Scanner;

public class Ejercice4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Escribe un numero: ");
	        int num1 = Math.abs(scanner.nextInt());
	        System.out.print("Escribe otro numero: ");
	        int num2 = Math.abs(scanner.nextInt());  
	        int mcd = (num1 < num2) ? num1 : num2;

	        while (num1 % mcd != 0 || num2 % mcd != 0) {
	            mcd--;
	        }
	        System.out.println("El máximo común divisor (MCD) de " +  num1+ " y " + num2 + " es: " + mcd);
	    }
	}
