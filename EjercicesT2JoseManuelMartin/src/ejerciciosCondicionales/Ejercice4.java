package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercice4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número entre 1 y 99: ");
	        int numero = scanner.nextInt();

	        if (numero >= 1 && numero <= 99) {
	            String numeroEnLetras = "";

	            if (numero >= 10 && numero < 20) {
	                switch (numero) {
	                    case 10: numeroEnLetras = "diez"; break;
	                    case 11: numeroEnLetras = "once"; break;
	                    case 12: numeroEnLetras = "doce"; break;
	                    case 13: numeroEnLetras = "trece"; break;
	                    case 14: numeroEnLetras = "catorce"; break;
	                    case 15: numeroEnLetras = "quince"; break;
	                    case 16: numeroEnLetras = "dieciséis"; break;
	                    case 17: numeroEnLetras = "diecisiete"; break;
	                    case 18: numeroEnLetras = "dieciocho"; break;
	                    case 19: numeroEnLetras = "diecinueve"; break;
	                }
	            } else {
	                int decena = numero / 10;
	                int unidad = numero % 10;

	                switch (decena) {
	                    case 2: numeroEnLetras = "veinti"; break;
	                    case 3: numeroEnLetras = "treinta"; break;
	                    case 4: numeroEnLetras = "cuarenta"; break;
	                    case 5: numeroEnLetras = "cincuenta"; break;
	                    case 6: numeroEnLetras = "sesenta"; break;
	                    case 7: numeroEnLetras = "setenta"; break;
	                    case 8: numeroEnLetras = "ochenta"; break;
	                    case 9: numeroEnLetras = "noventa"; break;
	                }

	                if (decena > 2 && unidad > 0) {
	                    numeroEnLetras += " y ";
	                }

	                switch (unidad) {
	                    case 1: numeroEnLetras += "uno"; break;
	                    case 2: numeroEnLetras += "dos"; break;
	                    case 3: numeroEnLetras += "tres"; break;
	                    case 4: numeroEnLetras += "cuatro"; break;
	                    case 5: numeroEnLetras += "cinco"; break;
	                    case 6: numeroEnLetras += "seis"; break;
	                    case 7: numeroEnLetras += "siete"; break;
	                    case 8: numeroEnLetras += "ocho"; break;
	                    case 9: numeroEnLetras += "nueve"; break;
	                }
	            }

	            System.out.println("El número " + numero + " en letras es: " + numeroEnLetras);
	        } else {
	            System.out.println("Por favor, ingrese un número válido entre 1 y 99.");
	        }

	        scanner.close();
	    }
	}