//access modifiers for class Hangman
public class Hangman {
    private String answer;
    private String hits;
    private String misses;
    public static final int NUMBER_OF_TRIES = 5;

    //empty space at first so that to be filled by each character the user has guessed
        public Hangman(String answer) {
            this.answer = answer;
            hits = "";
            misses = "";
        }

    //checks whether the character guessed is true or not
            boolean isCorrect = false;
            if (hits.indexOf(t) != -1 || misses.indexOf(t) != -1) {
                throw new IllegalArgumentException("Sorry you already made this guess ");
            }
            if (answer.indexOf(c) != -1) {
                isCorrect = true;
                hits += t;
            } else {
                misses += t;
            }
            return isCorrect;

        }
        // to prevent user from entering an empty guess
        public boolean applyGuess(String s) {
            if (s.length() == 0) {
                throw new IllegalArgumentException("Please do enter a guess");
            }
            return applyGuess(s.charAt(0));
        }
        // dispalay amount of character guessed
        public String getCurrentProgress() {
            String progress = "";
            for (char t : answer.toCharArray()) {
                char display = '-';
                if (hits.indexOf(t) != -1) {
                    display = t;
                }
                progress += display;
            }
            return progress;
        }

        // ishow if user has won
        public boolean isWon(){
            String progress = getCurrentProgress();
            if(progress.indexOf('-') == -1){
                return true ;
            } else {
                return false;
            }
        }

        // returning the answer
        public String getAnswer() {
            return answer;
        }

        //returning hits
        public String getHits() {
            return hits;
        }

        // returning misses
        public String getMisses() {
            return misses;
        }
    }
