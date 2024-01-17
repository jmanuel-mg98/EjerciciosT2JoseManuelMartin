package ejerciciosBucles;

import java.util.Scanner;

public class ejercice6 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Escribe un numero entre 0 y 20: ");
            num = scanner.nextInt();
        } while (num < 0 || num > 20);

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}