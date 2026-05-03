package programs;

public class PrimitiveDataType {
	
	public static void main(String[] args) {
		byte b1 = 25;
		byte b2 = -25;
		System.out.println("Value of byte, b1 is " + b1);
		System.out.println("Value of byte, b2 is " + b2);
		
		int s1 = 25000;
		int s2 = -25000;
		System.out.println("Value of short, s1 is " + s1);
		System.out.println("Value of short, s2 is " + s2);

		int i1 = 250000;
		int i2 = -250000;
		System.out.println("Value of int, i1 is " + i1);
		System.out.println("Value of int, i2 is " + i2);
		
		long l1 = 250000000; // Suffix L is optional, Long type can accommodate int range without any issue.
		long l2 = -250000000;// Suffix L is optional, Long type can accommodate int range without any issue.
		long l3 = 2500000000L; // Suffix L is compulsory since the number is out of the int range.
		System.out.println("Value of long, l1 is " + l1);
		System.out.println("Value of long, l2 is " + l2);
		System.out.println("Value of long, l3 is " + l3);
		
		float f1 = 2.123f; // f is compulsory
		System.out.println("Value of float, f1 is " + f1);
		
		double d1 = 3.1487654663636363; // d is optional
		System.out.println("Value of double, d1 is " + d1);
		
		char c1 = 65; // decimal value corresponding to character 'A'
		char c2 = 'A'; // character 'A'
		char c3 = '\u0041'; // unicode value for character 'A'
		System.out.println("Value of char, c1 is " + c1);
		System.out.println("Value of char, c2 is " + c2);
		System.out.println("Value of char, c3 is " + c3);
		
		boolean bo1 = true;
		boolean bo2 = false;
		System.out.println("Value of boolean, bo1 is " + bo1);
		System.out.println("Value of boolean, bo2 is " + bo2);
		
	}
}
