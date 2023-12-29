public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		double average = 0;
		int kids = 0;
		int twoKids = 0;
        int threeKids = 0;
        int sumKids = 0;
        int fourOrMoreKids = 0;
		String mostCommon = "The most common number of children is ";
		for (int i = 0; i < T; i++) {
			boolean haveBoys = false;
			boolean haveGirls = false;
			int count = 0;
			while (!haveGirls || !haveBoys) {
				count++;
				if (Math.random() > 0.5){
					haveGirls = true;
				}
				else{
					haveBoys = true;
				}
			}
			if (count==2){
				twoKids++;
			}
			else if(count==3){
				threeKids++;
			}
			else{
				fourOrMoreKids++;
			}
			sumKids += count;
		}

		if (twoKids>threeKids) {
			if (twoKids>fourOrMoreKids) {
				mostCommon = mostCommon + "2";
			}
		}
		else if (threeKids>fourOrMoreKids) {
			mostCommon = mostCommon + "3";
		}
		else{
			mostCommon = mostCommon + "4";
		}

		average = sumKids/(double)T;
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoKids);
		System.out.println("Number of families with 3 children: " + threeKids);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreKids);
		System.out.println(mostCommon);

	}
}
