//imports
import java.util.Scanner;
import java.io.Console;
import java.util.Random;
import java.util.List;
import java.util.ArrayList.*;
import java.util.*;


// access the modifiers
public class Prompter {
    private Scanner scanner;
    private Hangman game ;

    // introducing scanner in constructor Prompter
    public Prompter(Hangman game){
        this.game = game ;
        scanner = new Scanner(System.in);
    }
    //counting a no and displaying of guesses
    public void promptForGuess() {
        int numberOfTries = 0;
        while (numberOfTries < Hangman.NUMBER_OF_TRIES && !game.isWon()) {
            System.out.printf("You have %d try(ies) left to guess the right word %n%n" , Hangman.NUMBER_OF_TRIES-numberOfTries);
            System.out.println("Please do enter a guess");
            String guess = scanner.nextLine().trim().toLowerCase();
            try {
                boolean isHit = game.applyGuess(guess);
                if (!isHit) {
                    numberOfTries++;
                }
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
            displayProgress();
            displayOutCome(numberOfTries , Hangman.NUMBER_OF_TRIES-numberOfTries);
        }
    }

    // determining if one has won or not
    private void displayOutCome(int i , int j){
        if(i == Hangman.NUMBER_OF_TRIES ){
            System.out.println("Game Over !");
        }
        else if (game.isWon()){
            System.out.printf("Congratulations ! You guessed the right word with %d try(ies) left" , j);
        }
    }

    // determining progress of the user
    private void displayProgress(){
        System.out.println(game.getCurrentProgress());
    }

}
