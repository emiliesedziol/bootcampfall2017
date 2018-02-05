package emilie_sedziol_7_3_guessing_game;

public class guessingGame {

	public static void main(String[] args) {
		
		Console.printToConsole("Welcome to the Guess the Number Game");
		Console.printToConsole("++++++++++++++++++++++++++++++++++++");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Console.printToConsole(Game.welcomeToGameMsg);
			
			// 1 - start a new game
			// 2 - reset the guess count
			// 3 - generate correct number - new random number
			// instance of a new game
			// 
			Game thisGame = new Game();
			
			while (!thisGame.isCorrectGuess()) {
			
				// MIN and MAX are static variables so thisGame.MAX is not a good way to go
				int guess = Console.getInt("Enter Number: ", Game.MIN, Game.MAX);
				String msg = thisGame.evaluteGuessAndReturnMsg(guess);
				Console.printToConsole(msg);
			}
		
		choice = Console.getString("Continue? (y/n) ");
		}
		
		Console.printToConsole("Bye!");
	}

}
