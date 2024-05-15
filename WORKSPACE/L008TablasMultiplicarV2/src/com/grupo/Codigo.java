package com.grupo;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,multiplicando;
		// En esta seccion podemos ver como pide un numero
		System.out.println("Ingrese el multiplicando");
		multiplicando = teclado.nextInt();
		
		System.out.println("Ingrese hasta donde vamos a imprimir la tabla");
		n = teclado.nextInt();
		
		for(int a = 1; a <= n; a=a+1) {
			System.out.println(multiplicando+"x"+a+"="+(a*multiplicando));
		}
	}
}
