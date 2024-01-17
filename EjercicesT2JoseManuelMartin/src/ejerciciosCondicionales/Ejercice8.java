package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercice8 {
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese la distancia a recorrer en kilómetros: ");
	        int distancia = scanner.nextInt();
	        System.out.print("Ingrese el número de días de estancia: ");
	        int diasEstancia = scanner.nextInt();
	        double precioPorKilometro = 2.5;
	        double precioTotal = distancia * precioPorKilometro;

	        if (diasEstancia > 7 && distancia > 800) {
	            double reduccion = 0.3 * precioTotal;
	            precioTotal -= reduccion;
	        }
	        System.out.println("El precio del billete de tren es: " + precioTotal + " euros.");
	    }
	}
