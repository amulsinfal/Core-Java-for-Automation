package operators;

public class Modulo {

	public static void main(String[] args) {
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i2 % i1; 
		float res2 = f1 % i2; 
		double res3 = d1 % i1; 
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
	}
}
