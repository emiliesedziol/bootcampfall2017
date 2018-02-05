package emilie_sedziol_7_3_guessing_game;

// display messages
// handle user guesses
// no static methods
// keep track of numbers, guesses
// store statistics

public class Game {
	private int numberGuesses;  // number of guesses used to get to the correctNumber
	private int correntNumber;  // randomly generated number set at the beginning of each game
	public static final int MAX=100;
	public static final int MIN=1;
	public static final String welcomeToGameMsg = "I'm thinking of a number from 1 to 100";
	private boolean isCorrectGuess;
	
	public Game() {
		setnumberGuesses(0);
		setisCorrentNumber(generateRandomeNumber());
		setisCorrectGuess(false);
		// this constructor is for 1 game and resets each game
	}
	
	public String evaluteGuessAndReturnMsg(int guess) {
		String msg = "";
		incrementGuessCount();
		int diff = guess - correntNumber;
		if (diff > 10) { 
			msg = "Way to High";
		}
		else if (diff < -10) {
			msg = "Way too low";
		}
		else if (diff > 0) {
			msg = "Too high";
		}
		else if (diff < 0) {
			msg = "Too Low";
		}
		else {
			msg = " You got it in " + numberGuesses + " tries";
			isCorrectGuess = true;
		}
		return msg;
	}
	
	private void setisCorrectGuess(boolean b) {
		// this.isCorrectGuess = isCorrectGuess;
	}
	public boolean isCorrectGuess() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getnumberGuesses() {
		return numberGuesses;
	}
	public void setnumberGuesses(int numberGuesses) {
		this.numberGuesses = numberGuesses;
	}
	public int getisCorrentNumber() {
		return correntNumber;
	}
	public void setisCorrentNumber(int correntNumber) {
		this.correntNumber = correntNumber;
	}
	
	public int generateRandomeNumber() {
		return (int)((Math.random())*MAX)+1;
	}
	
	public void incrementGuessCount() {
		numberGuesses++;
	}
	
}
