package codigo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese hasta donde sumar");
		int n = teclado.nextInt();
		
		int i = 1;
		int suma = 0;
		
		while(i<=n) {
			suma = suma + i;
			i = i + 1;
		}
		
		System.out.println("Suma => " + suma);

		System.out.println("Termino!!!");

	}

}
