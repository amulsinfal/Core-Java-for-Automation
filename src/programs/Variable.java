package programs;

public class Variable {
	public static void main(String[] args) {
		int x = 100; //declaration and initialization on the same line.
		char var; // Only declaration, no initialization.
		var = 'A'; // initializing or assigning value to var 
		String name = "Amul"; // Reference type declaration and initialization.
		
		System.out.println("The value of x: " + x);
		System.out.println("The value of var: " + var);
		System.out.println("My Name is " + name);
	}
}