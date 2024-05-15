package codigo.ordenamiento.burbuja;

public class Principal {

	public static void main(String[] args) {

		int[] a = {9,1,7,6,5};
		int aux;
		for(int i = 0 ; i < 5; i = i+1) {
			for (int j = i + 1 ; j < 5; j = j + 1 ) {
				if( a[i] > a[j]) {
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
		
		System.out.println("*****************************************");
		for(int k = 0 ; k < a.length ; k = k + 1) {
			System.out.println(a[k]);
		}
		
		
		System.out.println("Termino");

	}

}
