package com.unc.logica;

import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un numero positivo");
		int a = teclado.nextInt();
		
		while(a<0) {
			System.out.println("El numero debe ser positivo, por favor ingrese otro");
			a = teclado.nextInt();
		}
		
		System.out.println("Felicitaciones el numero es positivo");
		
		
		System.out.println("Termino!!!");
	}

}
