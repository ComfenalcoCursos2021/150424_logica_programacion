package codigo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor ingrese un anio para saber si es bisiesto");
		int anio = teclado.nextInt();
		if (anio < 1582) {
			System.out.println("No es posible calcularlo");
		} else {
			if (anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0) {
				System.out.println("El anio es bisiesto");
			} else {
				if(anio % 4 == 0 && anio % 100 != 0) {
					System.out.println("El anio es bisiesto");	
				} else {
					System.out.println("El anio NO es bisiesto");
				}
			}
		}

	}

}
