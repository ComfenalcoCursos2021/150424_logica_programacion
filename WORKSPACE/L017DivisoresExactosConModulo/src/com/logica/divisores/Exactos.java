package com.logica.divisores;

import java.util.Scanner;

public class Exactos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor ingrese un numero para hallarle los divisores exactos");
		int n = teclado.nextInt();
		System.out.println("Los divisores son:");
		for( int i = 1 ; i<=n ; i++ ) {
			if(n%i==0) {
				System.out.println("-> " + i);
			}
		}
		
		System.out.println("Termino!!!");

	}

}
