package operators;

public class IncrementDecrement {
	
	public static void main(String[] args) {
		int i = 10, j = 5;
		i++;
		--j;
		
		System.out.println("i = " + i); // 11
		System.out.println("j = " + j); // 4	
		
		
		int res = i++ + --j;
		System.out.println("result = " + res); // 12 + 3 = 15
		System.out.println("i = " + i); // 12
		System.out.println("j = " + j); // 3	
			
	}

}
