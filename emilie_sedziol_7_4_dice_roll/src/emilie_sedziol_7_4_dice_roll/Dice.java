package emilie_sedziol_7_4_dice_roll;

public class Dice {
	private int dice1;
	private int dice2;
	// private int totalOfDiceRoll;
	public static final String welcomeMsg = "Welcome to dice roller";
	
	public Dice() {
		dice1 = 0;
		dice2 = 0;
	}
	
	public Dice(int dice1, int dice2) {
		super();
		this.dice1 = dice1;
		this.dice2 = dice2;
	}
	public int getDice1() {
		return dice1;
	}
	public int rollOneDice() {
		int randomInt = (int) (Math.random() * ((5 - 0) + 1) + 0);
        randomInt++; 
        int dice = randomInt;
        return dice;
	}
	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}
	public int getDice2() {
		return dice2;
	}
	public void setDice2(int dice2) {
		this.dice2 = dice2;
	}
	
	public int getTotalOfDiceRoll(int dice1, int dice2) {
		int totalOfDiceRoll = dice1 + dice2;
		return totalOfDiceRoll;
	}

	public static String getWelcomemsg() {
		return welcomeMsg;
	}

	public void roll() {
		
	}

}
