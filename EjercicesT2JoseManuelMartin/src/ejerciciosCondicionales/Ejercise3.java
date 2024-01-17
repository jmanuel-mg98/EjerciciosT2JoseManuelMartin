package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercise3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("cantidad de comida comprada es: ");
	        double comida = scanner.nextDouble();
	        System.out.print("el número de animales es: ");
	        int animales = scanner.nextInt();
	        System.out.print("los kilos de comida que comen los animales en total al dia son: ");
	        double comidaTotal = scanner.nextDouble();

	        if (animales > 0 && comidaTotal > 0) {
	            double racionDiaria = comidaTotal / animales;
	            if (comida >= racionDiaria) {
	                System.out.println("hay comida para todos los animales");
	            } else {
	                System.out.println("no hay comida para todos los animales");

	                double racionFaltante = racionDiaria - comida;
	                System.out.println("Cada animal debería recibir " + racionFaltante + " kilos adicionales de comida.");
	            }
	        } else {
	            System.out.println("Ingrese valores válidos");
	        }
	}

}
