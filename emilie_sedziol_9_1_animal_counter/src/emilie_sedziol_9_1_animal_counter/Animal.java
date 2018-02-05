package emilie_sedziol_9_1_animal_counter;

public abstract class Animal implements Countable {
	
	public int aCount = 0;
	
	@Override
	public void incrementCount() {
		aCount++;
	}

	@Override
	public void resetCount() {
		aCount = 0;
		
	}

	@Override
	public int getCount() {
		return 0;
	}

	@Override
	public String getCountString() {
		String str = "" + aCount;
		return str;
	}

	public int getaCount() {
		return aCount;
	}

	public void setaCount(int aCount) {
		this.aCount = aCount;
	}


	
}
