package ejerciciosBucles;

import java.util.Scanner;

public class Ejercice7 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Escribe un numero: ");
	        int num = scanner.nextInt();
	        for (int i = 1; i <= num; i++) {
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k);
	            }
	            for (int l = i - 1; l >= 1; l--) {
	                System.out.print(l);
	            }
	            System.out.println();
	        }
	    }
	}
