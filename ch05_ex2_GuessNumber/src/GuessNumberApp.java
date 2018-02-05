import java.util.Scanner;

public class GuessNumberApp {
    
    private static void displayWelcome(int limit) {
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + limit);
        System.out.println();
    }
    
    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;   // d is >= 0.0 and < limit
        int randomInt = (int) d;            // convert double to int
        randomInt++;                        // int is >= 1 and <= limit
        return randomInt;
    }

    public static void main(String[] args) {
        final int LIMIT = 10;
        
        displayWelcome(LIMIT);					// public
        int number = getRandomInt(LIMIT);		// public

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in); 
        int count = 1;
        int guess = 0; // had to be set to zero for the code below the !isValid to work
        					// or the guess wouldn't been seen as assigned
        while (true) {
        		// System.out.print("Your guess: ");
        		boolean isValid = false;
        		while (!isValid) {
        			System.out.print("Your guess: ");
        			if (sc.hasNextInt()) {
        				guess = sc.nextInt();
        				// sc.nextLine();
        				isValid = true;
        			} else {
        				System.out.println("Error: enter an Integer ");
        			}
        			sc.nextLine();
        		}
            
            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }
            
            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            } else {
                System.out.println("You guessed it in " + 
                                   count + " tries.\n");
                break;
            }            
            count++;
        }
        System.out.println("Bye!");
    }   
}