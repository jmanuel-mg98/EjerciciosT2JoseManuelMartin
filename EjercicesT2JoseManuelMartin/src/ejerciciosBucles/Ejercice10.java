package ejerciciosBucles;

import java.util.Scanner;

public class Ejercice10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Dime un número mayor o igual a 0: ");
            num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Error, dime un número mayor o igual a 0.");
            }
        } while (num < 0);
        int numeroOriginal = num;
        int numeroReverso = 0;
        while (num > 0) {
            int digito = num % 10;
            numeroReverso = numeroReverso * 10 + digito;
            num /= 10;
        }
        if (numeroOriginal == numeroReverso) {
            System.out.println("El número " + numeroOriginal + " es capicúa.");
        } else {
            System.out.println("El número " + numeroOriginal + " no es capicúa.");
        }
    }
}
