package operators;

public class Subtraction {
	
	public static void main(String[] args) {
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i2 - i1; // Subtraction and result will be int
		float res2 = f1 - i2; // Subtraction and result will be float
		double res3 = d1 - i1; // Subtraction and result will be double
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
	}
}
