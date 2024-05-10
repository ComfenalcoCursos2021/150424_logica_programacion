package elpaquete;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int a, x, y;
		System.out.println("Bienvenido vamos a hallar el mayor de 3 numeros");
		System.out.println("Los numeros deben ser diferentes");

		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();

		System.out.println("Ingrese el segundo numero");
		x = teclado.nextInt();

		System.out.println("Ingrese el tercer numero");
		y = teclado.nextInt();

		if (a > x) {
			if (a > y) {
				System.out.println(a + " es el mayor");
			} else {
				System.out.println(y + " es el mayor");
			}
		} else {
			if (x > y) {
				System.out.println(x + " es el mayor");
			} else {
				System.out.println(y + " es el mayor");
			}
		}

	}

}
