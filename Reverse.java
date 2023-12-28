public class Reverse {
	public static void main (String[] args){
		String A = args[0];
		for (int i = A.length() - 1 ; i >= 0 ; i--){

			System.out.print(A.charAt(i));
	    }
	        System.out.print("\nThe middle character is " + (A.charAt(A.length()/2)));
    }
}