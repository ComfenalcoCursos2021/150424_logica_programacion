package grupo.logica.contador;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese el numero para contarle las cifras");
		int x = teclado.nextInt();

		x = Math.abs(x);
		
		int cant = 1;
		int a = 10;

		while (x >= a) {
			cant = cant + 1;
			a = a * 10;
		}

		System.out.println("El numero tiene " + cant + " cifras");

		System.out.println("Termino!!!");

	}

}
