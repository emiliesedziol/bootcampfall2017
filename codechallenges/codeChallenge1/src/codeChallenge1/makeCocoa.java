package codeChallenge1;

public class makeCocoa {
	public static void main(String[] args) {
		System.out.println("Make Chocolate");
		System.out.println();
		System.out.println("small bar 1 kilo");
		System.out.println("big bar 5 kilos");
		System.out.println("Goal equals 1 large bar plus up to 4 small bars");
		System.out.println();
		System.out.println();
		
		int smallBar = 3;  // kilo
		int bigBar = 1;  // kilo
		int goal = 9;     // 1 large bar plus small bars(s) up to 4
		
		makeChocolate(smallBar, bigBar, goal);
		
		goal = 10;
		makeChocolate(smallBar, bigBar, goal);
		
		goal = 7;
		makeChocolate(smallBar, bigBar, goal);
		
		System.out.print("Bye!");
		
	}
	
	public static void makeChocolate(int smallBar, int bigBar, int goal) {
		System.out.println();
		System.out.println("Goal: " + goal);
		int tmp = goal - (bigBar * 5);
		if (tmp == 0) {
			System.out.println("Only 1 large bar needed to reach goal");
			System.out.println("");
		}
		else if (tmp < 0) {
			System.out.println("Goal is too small for a large bar");
			System.out.println();
		}
		else if (tmp > smallBar) {
			System.out.println("Not enough small bars");
			System.out.println();
		}
		else {
			System.out.println("Small Bars:  " + tmp);
		}
		
	}

}
