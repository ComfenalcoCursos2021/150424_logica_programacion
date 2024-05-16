package com.operaciones.calculadora;

import java.util.Scanner;

public class Principal {

	
	public static void titulo() {
		System.out.println("====================================");
		System.out.println("=                                  =");
		System.out.println("=           CALCULADORA            =");
		System.out.println("=                                  =");
		System.out.println("====================================");
	}
	
	public static void menu() {
		System.out.println("------------------------------------");
		System.out.println("-   1. SUMAR                       -");
		System.out.println("-   2. RESTAR                      -");
		System.out.println("-   3. MULTIPLICAR                 -");
		System.out.println("-   4. DIVIDIR                     -");
		System.out.println("-                                  -");
		System.out.println("-   9. SALIR                       -");
		System.out.println("------------------------------------");
	}
	public static void imprimirResultado(float x) {
		System.out.println("====================================");
		System.out.println("=           RESULTADO              =");
		System.out.println("=            "+ x );
		System.out.println("====================================");
	}
	public static float procesarOpcion(int op, float x, float y) {
		float r = 0;
		if(op == 1) {
			r = x + y;
		}
		if(op == 2) {
			r = x - y;
		}
		if(op == 3) {
			r = x * y;
		}
		if(op == 4) {
			r = x / y;
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		titulo();	
		
		int opcion = 0;
		
		while(opcion != 9) {
			menu();
			System.out.println("Ingrese una opcion");
			opcion = teclado.nextInt();
			
			// aqui va la validacion
			while( (opcion < 1 || opcion > 4) && opcion != 9  ) {
				menu();
				System.out.println("Por favor ingrese una opcion valida!!");
				opcion = teclado.nextInt();
			}
			
			
			if(opcion != 9) {
				float a,b,resultado = 0;
				
				System.out.println("Ingrese el primer valor");
				a = teclado.nextFloat();
				
				System.out.println("Ingrese el segundo valor");
				b = teclado.nextFloat();
				
				resultado = procesarOpcion(opcion, a, b);
				
				imprimirResultado(resultado);
				
			}
			
			
			
		}
		
		
		System.out.println("Termino!!");

	}

}
