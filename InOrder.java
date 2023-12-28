public class InOrder {
	public static void main (String[] args) {
		int x = (int) (10 * Math.random());
		int y = (int) (10 * Math.random());
		do {
			System.out.print( x + " ");
			y = x; 
			x = (int) (10 * Math.random()); 
		} while (y<=x);
		
	} 
} 
