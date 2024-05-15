package codigo;

import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese cuantos datos va a validar");
		int cantDatos = teclado.nextInt();
		
		int[] a = new int[cantDatos];
		
		int mayor = 0;

		for (int i = 0; i < cantDatos; i = i + 1) {
			System.out.println("Ingrese el numero en la posicion " + (i+1) );
			
			a[i] = teclado.nextInt();
			
			if(i==0) {
				mayor = a[i];
			} 
			
			if (a[i] > mayor ) {
				mayor = a[i];
			}
		}

		System.out.println("El mayor numero es " + mayor);
		
		System.out.println("Termino");

	}

}
