package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercice5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese un número: ");
	        int numero = scanner.nextInt();
	        int valorAbsoluto = (numero >= 0) ? numero : -numero;
	        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
	    }
	
	}

