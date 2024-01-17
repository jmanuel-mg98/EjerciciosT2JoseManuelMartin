package ejerciciosBucles;

import java.util.Scanner;

public class Ejercice3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para la base y altura del triángulo: ");
        int n = scanner.nextInt();
        for (int vecesARecorrer = 1; vecesARecorrer <= n; vecesARecorrer++) {
            // Imprime espacios en blanco para alinear el triángulo
            for (int cantidadEspacios = 1; cantidadEspacios <= n - vecesARecorrer; cantidadEspacios++) {
                System.out.print(" ");
            }

            // Imprime asteriscos para formar el triángulo
            for (int cantidadEsteriscos = 1; cantidadEsteriscos <= 2 * vecesARecorrer - 1; cantidadEsteriscos++) {
            	if(cantidadEsteriscos%2==0) { 
                System.out.print(" ");
            	}else { //Solo te pinta el asterisco si el número residual es distinto de 0
            	System.out.print("*");	
            	}
            }

            // Salto de línea después de cada fila
            System.out.println();
        }


	}

}
