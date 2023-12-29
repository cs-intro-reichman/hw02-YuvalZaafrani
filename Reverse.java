public class Reverse {
	public static void main (String[] args){
		String A = args[0];
		int last = A.length() - 1;
		for (int i = last ; i >= 0 ; i--){

			System.out.print(A.charAt(i));
	    }
	        System.out.print("\nThe middle character is " + (A.charAt(last/2)));
    }
}