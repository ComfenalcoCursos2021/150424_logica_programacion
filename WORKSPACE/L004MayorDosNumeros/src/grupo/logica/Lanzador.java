package grupo.logica;

import java.util.Scanner;

public class Lanzador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a,x;
		
		System.out.println("Bienvenido al algoritmo que le ayudara a saber cual es el numero mayor de dos numeros");
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		x = teclado.nextInt();
		if(a>x) {
			System.out.println(a + " es el mayor");
		} else {
			System.out.println(x + " es el mayor");
		}
		
		System.out.println("Termino");
		
		
	}

}
