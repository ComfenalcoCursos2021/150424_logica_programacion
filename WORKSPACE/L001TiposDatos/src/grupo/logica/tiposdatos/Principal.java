package grupo.logica.tiposdatos;

public class Principal {

	public static void main(String[] args) {
		byte a = 125;
		System.out.println("Byte -> " + Byte.MIN_VALUE);
		System.out.println("Byte -> " + Byte.MAX_VALUE);
		short b = 130;
		System.out.println("Short -> " + Short.MIN_VALUE);
		System.out.println("Short -> " + Short.MAX_VALUE);		
		int c = 2147483647;
		System.out.println("Integer -> " + Integer.MIN_VALUE);
		System.out.println("Integer -> " + Integer.MAX_VALUE);
		long d = 2147483648L;
		System.out.println("Long -> " + Long.MIN_VALUE);
		System.out.println("Long -> " + Long.MAX_VALUE);
		float e = 15.5f;
		System.out.println("Float -> " + Float.MIN_VALUE);
		System.out.println("Float -> " + Float.MAX_VALUE);		
		double f = 15.5;
		System.out.println("Double -> " + Double.MIN_VALUE);
		System.out.println("Double -> " + Double.MAX_VALUE);		
	}

}
