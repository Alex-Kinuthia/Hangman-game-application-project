// imports
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

//class HangmanTest
public class HangmanTest {
    Hangman hangman ;

    // add additional functionality to all tasks within the test
    public ExpectedException exception = ExpectedException.none();

    // Shows that this method must be executed before each test in the class
    @Before
    public void setUp() throws Exception {
        hangman = new Hangman("testing");

    }
    //for choosing a character
        @Test
        public void choosingACharacterInTheAnswerReturnsTrue() throws Exception {
            assertTrue(hangman.applyGuess('t'));
        }

        // character you guess is included
        @Test
        public void ifAStringIsEnteredOnlyTheFirstCharacterMatters() throws Exception{
            assertTrue(hangman.applyGuess("tsng"));
        }

        // to prevent user from entering an empty guess
        @Test
        public void givingAnEmptyGuessIsNotAllowed() throws Exception {
            exception.expect(IllegalArgumentException.class);
            exception.expectMessage("Please do enter a guess");

            hangman.applyGuess("");
        }

        // to make the guess that is already been made previosly
        @Test
        public void makingAGuessThatIsAlreadyBeenMadeIsNotAllowed() throws Exception {
            exception.expect(IllegalArgumentException.class);
            exception.expectMessage("Sorry you already made this guess ");

            hangman.applyGuess("t");
            hangman.applyGuess("t");
        }

        // to show that you entered the guess correctly
        @Test
        public void enteringAllCharactersInTheAnswerAtLeastOnceResultsInWinningTheGame() throws Exception{
            hangman.applyGuess("t");
            hangman.applyGuess("e");
            hangman.applyGuess("s");
            hangman.applyGuess("t");
            hangman.applyGuess("i");
            hangman.applyGuess("n");
            hangman.applyGuess("g");

            assertTrue(hangman.isWon());

        }

    }
