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
