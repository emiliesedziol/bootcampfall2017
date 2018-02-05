package emilie_sedziol_7_4_dice_roll;

public class DiceRollApp {

	public static void main(String[] args) {
		Console.printToConsole(Dice.welcomeMsg);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			Dice dice = new Dice();
			int dice1 = dice.rollOneDice();
			System.out.println("Roll Dice1: " + dice1);
			int dice2 = dice.rollOneDice();
			System.out.println("Roll Dice2: " + dice2);
			int total = dice.getTotalOfDiceRoll(dice1, dice2);
			System.out.println("Total roll: " + total);
			
			choice = Console.getString("Continue? (y/n) ");
		}
		
		Console.printToConsole("Bye!");
	}

}
