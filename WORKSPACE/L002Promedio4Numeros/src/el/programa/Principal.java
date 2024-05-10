package el.programa;

import java.util.Scanner;

public class Principal {	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a,b,c,d;		
		float p;
		System.out.println("Bienvenido al programa que calcula el promedio de 4 numeros");
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		
		System.out.println("Ingrese el tercero numero");
		c = teclado.nextInt();
		
		System.out.println("Ingrese el cuarto numero");
		d = teclado.nextInt();
		
		p = (a+b+c+d)/4.0f;
		
		System.out.println("El promedio de los cuatro numeros es = " + p);
		
		
		System.out.println("Termino...");
		
	}
}
