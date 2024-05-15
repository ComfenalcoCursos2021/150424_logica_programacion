package com.logica.programacion;

import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, suma = 0;
		
		System.out.println("Ingrese hasta donde vamos a sumar");
		n = teclado.nextInt();
		
		for(int i = 1 ; i <= n ; i =  i + 1 ) {
			suma = suma + i;
		}
		System.out.println("La suma es " + suma);

		System.out.println("Termino!!!");
	}

}
