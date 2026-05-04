package operators;

public class Addition {

	public static void main(String[] args) {
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		String msg = "Hello ";
		
		int res1 = i1 + i2; // Addition and result will be int
		float res2 = i1 + f1; // Addition and result will be float
		double res3 = i2 + d1; // Addition and result will be double
		String res4 = msg + f1; // concatenation and result will be String

		
		System.out.println("res1 = " + res1); 
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);
		
	}
}
