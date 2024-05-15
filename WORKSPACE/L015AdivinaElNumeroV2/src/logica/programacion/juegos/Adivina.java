package logica.programacion.juegos;

import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		
		double numero = Math.random();
		
		numero = numero * 100.0;
		
		int numeroEntero = (int) numero;
		int x = numeroEntero + 1;
		
		while(numeroEntero != x) {
			System.out.println("Intenta adivinar");
			x = teclado.nextInt();
			
			if(numeroEntero != x) {
				if(x < numeroEntero) {
					System.out.println("El numero oculto es mayor");
				} else {
					System.out.println("El numero oculto es menor");
				}
			}
			
			
			
			
		}
		
		System.out.println("¡¡¡¡GANO!!!!");
		System.out.println("Termino");

	}

}
