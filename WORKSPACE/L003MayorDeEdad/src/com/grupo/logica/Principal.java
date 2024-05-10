package com.grupo.logica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad;
		System.out.println("Bienvenido, por favor ingrese la edad");
		edad = teclado.nextInt();
		
		if(17 < edad) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		
		System.out.println("Termino!!!");
	}

}
