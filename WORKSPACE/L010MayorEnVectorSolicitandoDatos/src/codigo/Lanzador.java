package codigo;

import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] a = new int[5];
		int mayor = 0;

		for (int i = 0; i < 5; i = i + 1) {
			System.out.println("Ingrese el numero en la posicion " + (i+1) );
			
			a[i] = teclado.nextInt();

			if (mayor < a[i]) {
				mayor = a[i];
			}
		}

		System.out.println("El mayor numero es " + mayor);

	}

}
