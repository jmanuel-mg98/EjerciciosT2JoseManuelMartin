package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercice7 {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la hora. Horas: ");
	        int horas = scanner.nextInt();

	        System.out.print("Minutos: ");
	        int minutos = scanner.nextInt();

	        System.out.print("Segundos: ");
	        int segundos = scanner.nextInt();
	        segundos++;

	        if (segundos == 60) {
	            segundos = 0;
	            minutos++;

	            if (minutos == 60) {
	                minutos = 0;
	                horas++;

	                if (horas == 24) {
	                    horas = 0;
	                }
	            }
	        }

	        System.out.println("Hora después de sumar un segundo: " + horas + ":" + minutos + ":" + segundos);
	    }
	}
