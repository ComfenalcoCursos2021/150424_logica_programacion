package codigo;

public class Lanzador {

	public static void main(String[] args) {

		int[] a = new int[5];

		a[0] = 4;
		a[1] = 9;
		a[2] = 10;
		a[3] = 7;
		a[4] = 9;

		int[] b = { 8, 5, 1, 3, 9 };

		int m = 0;

		for (int i = 0; i < 5; i = i + 1) {
			if(m<b[i]) {
				m = b[i];
			}
		}
		
		System.out.println("El mayor numero es " + m);

	}

}
