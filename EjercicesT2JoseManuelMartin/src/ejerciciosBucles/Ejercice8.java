package ejerciciosBucles;

import java.util.Scanner;

public class Ejercice8 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int ultimoNumero = 0;
	        int totalNumerosIntroducidos = 0;
	        int totalNumerosFallados = 0;
	        System.out.println("Dime un numero inicial: ");
	        int numero;
	        do {
	            System.out.print("Dime un numero: ");
	            numero = scanner.nextInt();
	            if (numero == 0) {
	                break;
	            }
	            totalNumerosIntroducidos++;
	            if (numero <= ultimoNumero) {
	                System.out.println("Fallo es menor");
	                totalNumerosFallados++;
	            } else {
	                ultimoNumero = numero;
	            }

	        } while (true);
	        System.out.println("total de números introducidos: " + totalNumerosIntroducidos);
	        System.out.println("números fallados: " + totalNumerosFallados);
	    }
	}
