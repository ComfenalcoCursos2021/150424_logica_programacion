package codigo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, t;
		System.out.println("Bienvenido vamos a hallar el mayor de 3 numeros");
		System.out.println("Los numeros deben ser diferentes\n\n");

		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();

		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();

		System.out.println("Ingrese el tercer numero");
		c = teclado.nextInt();
		System.out.println("\n\n\nAntes de ordenar\n");
		System.out.println(a + " -> " + b + " -> " + c);
		if (b > a) {
			t = a;
			a = b;
			b = t;
		}
		
		if(c > b) {
			t = c;
			c = b;
			b = t;
		}

		if (b > a) {
			t = a;
			a = b;
			b = t;
		}
		
		if(c > b) {
			t = c;
			c = b;
			b = t;
		}
		
		
		System.out.println("\n****************************\n");
		System.out.println(a + " -> " + b + " -> " + c);
		System.out.println("");
		System.out.println("Termino!!!");
	}

}
