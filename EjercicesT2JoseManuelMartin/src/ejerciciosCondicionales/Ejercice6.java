package ejerciciosCondicionales;

import java.util.Scanner;
import java.util.Random;

public class Ejercice6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int numero1 = random.nextInt(99) + 1;
	        int numero2 = random.nextInt(99) + 1;
	        System.out.println("Suma los siguientes dos números:");
	        System.out.println(numero1 + " + " + numero2);

	        System.out.print("Cual es su suma? ");
	        int respuestaUsuario = scanner.nextInt();

	        int resultadoCorrecto = numero1 + numero2;

	        if (respuestaUsuario == resultadoCorrecto) {
	            System.out.println("¡Correcto!");
	        } else {
	            System.out.println("Incorrecto. La suma da " + resultadoCorrecto);
	        }
	    }
	}