package ejerciciosBucles;

import java.util.Scanner;

public class Ejercice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicita al usuario la hora, minutos, segundos y la cantidad de segundos a incrementar
        System.out.print("Ingrese la hora (formato 24 horas): ");
        int hora = scanner.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingrese los segundos: ");
        int segundos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de segundos a incrementar: ");
        int segundosIncremento = scanner.nextInt();

        // Calcula el nuevo tiempo
        for (int i = 0; i < segundosIncremento; i++) {
            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    hora++;

                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
        }
        System.out.println("La nueva hora es: " + hora +":"+ minutos+":" + segundos);
        
	}
}
