package emilie_sedziol_9_1_animal_counter;

public class AnimalCounterApp {

	public static void main(String[] args) {
		System.out.println("inside the main app");
		System.out.println("");
		
		Alligator a = new Alligator();
		
		count(a, 3);
		
		System.out.println("");
		System.out.println("Sheep");
		
		Sheep b = new Sheep();
		count(b, 2);
		System.out.println("");
		
		try {
			Sheep b2 = new Sheep();
			
			Sheep bs = (Sheep) b2.clone();
			bs.instanceVariable = "Black Sheep";
			count(bs, 3);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("Sheep");
		
		Sheep b3 = new Sheep();
		count(b, 1);
		System.out.println("");
		
		System.out.println("");
		System.out.println("Bye Bye Black Sheep");

	}
	
	public static void count(Countable c, int maxCount) {
		// Alligator a = new Alligator();
		c.resetCount();
		
		for (int i = 1; i <= maxCount; i++ ) {
			String aString = c.getCountString();
			System.out.println(aString);
			
		}
	}

}
