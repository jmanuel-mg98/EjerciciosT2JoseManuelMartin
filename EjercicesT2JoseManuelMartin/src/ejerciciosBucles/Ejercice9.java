package ejerciciosBucles;

import java.util.Scanner;

public class Ejercice9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Dime un numero mayor que 0: ");
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Error, dime un número mayor que 0.");
            }
        } while (num <= 0);
        int contadorDigitos = 0;
        int numeroAbsoluto = Math.abs(num);
        while (numeroAbsoluto > 0) {
            numeroAbsoluto /= 10;
            contadorDigitos++;
        }
        System.out.println("El número " + num + " tiene " + contadorDigitos + " dígitos.");
    }
}
