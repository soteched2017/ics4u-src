/*
 * Programmer:
 * Date:
 * Program Name: WordScramble.java
 * Program Description: This program uses a recursive algorithm to unscramble words.
 */

package wordscramble;
/**
 *
 * @author School
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letters = "NUF";
        System.out.println("Word Scramble \n");
        scrambleWords(letters, "");
    }

    static public void scrambleWords (String word, String scrambledLetters) {
        String remainingLetters;
        String origWord = word;
        String origscrambledLetters = scrambledLetters;

        if (word.length() == 1) {
            System.out.println(scrambledLetters + word);
        } else {
            for (int pos = 0; pos <origWord.length(); pos++) {
                remainingLetters = origWord.substring(0, pos) +
                        origWord.substring(pos+1, origWord.length());

                scrambleWords(remainingLetters, origscrambledLetters + origWord.charAt(pos));
            }
        }
    }

}
