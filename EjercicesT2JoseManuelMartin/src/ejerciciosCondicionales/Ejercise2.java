package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercise2 {

	public static void main(String[] args) {
		int num,resto;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe los numeros de un DNI: ");
		num= sc.nextInt();
		if (num<100000000) {
			resto =num%23;
			switch (resto) {
			 case 0 -> System.out.println(num + "T");
             case 1 -> System.out.println(num + "R");
             case 2 -> System.out.println(num + "W");
             case 3 -> System.out.println(num + "A");
             case 4 -> System.out.println(num + "G");
             case 5 -> System.out.println(num + "M");
             case 6 -> System.out.println(num + "Y");
             case 7 -> System.out.println(num + "F");
             case 8 -> System.out.println(num + "P");
             case 9 -> System.out.println(num + "D");
             case 10 -> System.out.println(num + "X");
             case 11 -> System.out.println(num + "B");
             case 12 -> System.out.println(num + "N");
             case 13 -> System.out.println(num + "J");
             case 14 -> System.out.println(num + "Z");
             case 15 -> System.out.println(num + "S");
             case 16 -> System.out.println(num + "Q");
             case 17 -> System.out.println(num + "V");
             case 18 -> System.out.println(num + "H");
             case 19 -> System.out.println(num + "L");
             case 20 -> System.out.println(num + "C");
             case 21 -> System.out.println(num + "K");
             case 22 -> System.out.println(num + "E");
             default -> System.out.println("Error en el cálculo de la letra.");
			}
			
		} else{
			System.out.print("dato erroneo");
		}

	}

}
