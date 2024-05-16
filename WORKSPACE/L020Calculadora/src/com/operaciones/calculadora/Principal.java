package com.operaciones.calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("=                                  =");
		System.out.println("=           CALCULADORA            =");
		System.out.println("=                                  =");
		System.out.println("====================================");
		
		
		int opcion = 0;
		
		while(opcion != 9) {
			System.out.println("====================================");
			System.out.println("=   1. SUMAR                       =");
			System.out.println("=   2. RESTAR                      =");
			System.out.println("=   3. MULTIPLICAR                 =");
			System.out.println("=   4. DIVIDIR                     =");
			System.out.println("=                                  =");
			System.out.println("=   9. SALIR                       =");
			System.out.println("====================================");
			System.out.println("Ingrese una opcion");
			opcion = teclado.nextInt();
			
			// aqui va la validacion
			while( (opcion < 1 || opcion > 4) && opcion != 9  ) {
				System.out.println("====================================");
				System.out.println("=   1. SUMAR                       =");
				System.out.println("=   2. RESTAR                      =");
				System.out.println("=   3. MULTIPLICAR                 =");
				System.out.println("=   4. DIVIDIR                     =");
				System.out.println("=                                  =");
				System.out.println("=   9. SALIR                       =");
				System.out.println("====================================");
				System.out.println("Por favor ingrese una opcion valida!!");
				opcion = teclado.nextInt();
			}
			
			
			if(opcion != 9) {
				float a,b,resultado = 0;
				
				System.out.println("Ingrese el primer valor");
				a = teclado.nextFloat();
				
				System.out.println("Ingrese el segundo valor");
				b = teclado.nextFloat();
				
				if(opcion == 1) {
					resultado = a + b;
				}
				if(opcion == 2) {
					resultado = a - b;
				}
				if(opcion == 3) {
					resultado = a * b;
				}
				if(opcion == 4) {
					resultado = a / b;
				}
				System.out.println("====================================");
				System.out.println("=           RESULTADO              =");
				System.out.println("=            "+ resultado );
				System.out.println("====================================");
				
			}
			
			
			
		}
		
		
		System.out.println("Termino!!");

	}

}
