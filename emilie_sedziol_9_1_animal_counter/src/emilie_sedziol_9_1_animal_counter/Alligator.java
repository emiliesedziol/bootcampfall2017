package emilie_sedziol_9_1_animal_counter;

public class Alligator extends Animal {

	@Override
	public String getCountString() {
		incrementCount();
		String aCountString = "" + aCount + " Alligator";
		return aCountString;
	}
}
