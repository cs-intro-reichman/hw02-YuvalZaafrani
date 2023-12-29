public class DamkaBoard {
	public static void main(String[] args) {
	    int x = Integer.parseInt(args[0]);
	    for (int i = 0 ; i < x ; i++) {
	        for (int j = 0 ; j < x ; j++) {
	        	if (i % 2 == 1) {
	                System.out.print(" *");
	        }
	        else {
	        	System.out.print("* ");

	        }
	        }
	        System.out.println();
	    }	
	}
}
