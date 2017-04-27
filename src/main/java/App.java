//imports
import java.util.*;

//class app
public class App {

  // the words that would be detected
    public static void main(String[] args) {
      List<Character> guess = new ArrayList<>();
      Random randomNumber  = new Random();
      String[] words =
      { "testing", "boy", "girl", "boy", "sister", "docter","surgon", "branches", "dig", "crawl", "jump", "hurry", "slay", "sleepy", "noisy", "caring", "friend", "week", "day", "dark"
      };
      Prompter prompter = new Prompter(new Hangman(words[randomNumber.nextInt(words.length)]));
    	// Prompter prompter = new Prompter(new Hangman("testing"));
    	  prompter.promptForGuess();
        }
    }
