package emilie_sedziol_9_1_animal_counter;

public class Sheep extends Animal implements Cloneable {
	
	protected String instanceVariable="Sheep";
 
	public String getInstanceVariable() {
		return instanceVariable;
	}
	
	public String setInstanceVariable() {
		return instanceVariable;
	}

	public void setInstanceVariable(String instanceVariable) {
		this.instanceVariable = instanceVariable;
	}

	@Override
	public String getCountString() { 
		incrementCount();
		String aCountString = "" + aCount + " " + instanceVariable;
		return aCountString;
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
