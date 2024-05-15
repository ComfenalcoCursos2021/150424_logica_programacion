package codigo.ordenamiento.burbuja;

public class Principal {

	public static void main(String[] args) {

		int[] a = {9,1,7,6,5,5,6,4,1,81,3,5,3,18,351,8,31,8,21,8,3,8,13,85,3,8,18,354,77};
		int aux;
		for(int i = 0 ; i < a.length; i = i+1) {
			for (int j = i + 1 ; j < a.length; j = j + 1 ) {
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
