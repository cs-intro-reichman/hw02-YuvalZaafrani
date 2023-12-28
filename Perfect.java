public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int sum = 0;
		String message = x + " is a perfect number since " + x + " = "; 
		for (int i = 1 ; i < x ; i++) {
			if (x % i == 0) {
				sum += i;
				message += i + " + ";
			}
		}
		if(sum != x)
		{
			message = x + " is not a perfect number";
		}
		else {
			message = message.substring(0, message.length() - 2);
		}
		System.out.println(message);
	}
}
