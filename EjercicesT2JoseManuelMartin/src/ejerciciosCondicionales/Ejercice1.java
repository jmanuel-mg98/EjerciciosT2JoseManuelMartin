package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercice1 {

	public static void main(String[] args) {
		int num,numInvertido=0,numNuevo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero comprendido en entre 0 y 9999: ");
		num=sc.nextInt();
		numNuevo=num;
		if (num<10000){
			while(num>0) {
				int digito= num%10;
				numInvertido=numInvertido*10+digito;
				System.out.println(numInvertido);
				num=num/10;
				System.out.println(num);
			}
			if (numNuevo==numInvertido) {
                System.out.println(numNuevo + " es un número capicúa.");
            } else {
                System.out.println(numNuevo + " no es un número capicúa.");
			}
		}else {
			System.out.print("dato erroneo");
		}
		

	}

}
