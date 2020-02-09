package _02_gotta_catchem_all;

public class ExceptionMethods {

	double divide(double x, double y) throws IllegalArgumentException{
		double q = x / y;
		if (y == 0) {
			throw new IllegalArgumentException();
		}
		return q;
	}
	
	String reverseString(String s) throws IllegalStateException{
	String reverse="";
	if (s.isEmpty()) {
		throw new IllegalStateException();
	}
	for (int i = s.length(); i > 0; i--) {
		reverse=reverse+s.charAt(i);
	}
		
		
		return reverse;
		
	}
	
	
	
}
