package com.unc.logica;

public class Principal {

	public static void imprimirMenu() {
		System.out.println("====================================");
		System.out.println("=                                  =");
		System.out.println("=           el menu                =");
		System.out.println("=                                  =");
		System.out.println("====================================");
	}
	
	public static double pi() {
		return Math.PI;
	}
	public static int num0a100() {
		
		double numero = Math.random();		
		numero = numero * 100.0;		
		int numeroEntero = (int) numero;
		
		return numeroEntero;
	}
	
	public static int num0a(int maximo) {
		
		double numero = Math.random();		
		numero = numero * maximo;		
		int numeroEntero = (int) numero;
		
		return numeroEntero;
	}
	
	public static int suma(int a, int b) {
		int suma = a + b;
		return suma;
	}
	
	
	public static void main(String[] args) {

		imprimirMenu();		
		System.out.println("El numero Pi " + pi() );		
		System.out.println("El numero aleatorio-> " + num0a100());
		System.out.println("El numero aleatorio 0 a 1000-> " + num0a(1000));
		System.out.println("El numero aleatorio 0 a 100000-> " + num0a(100000));
		
		
		System.out.println("El numero aleatorio 0 a 50-> " + num0a(50));
		
		int resultado = suma(98,45);
		System.out.println("la suma de -> " +  resultado);
	}
	
	

}
