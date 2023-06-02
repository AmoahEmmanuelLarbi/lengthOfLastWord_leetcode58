/* Leetcode Question: Length of last word. */
// A program that check that last word of a sentence.

package leetCode;



public class lastWordLength {

    public static void main(String[] args) {
        String phrase = "Amoah Larbi Emmanuel a q";

        // calling method getLengthOfLastWord
        int phrase_len = getLengthOfLastWord(phrase);
        System.out.print("The last is \"" + getLastWord(phrase) + "\"");
        System.out.println(" with a length of "+ phrase_len);

    }

    public static int getLengthOfLastWord(String sample){
        // first remove leading and trailing space from sentence
        String x = sample.trim(); // a copy of trimmed sentence
        int len = 0;
        // first iterate from start to end of sentence
        for (int i = 0; i < x.length(); i++){
            // start counting each letter
            if (x.charAt(i) == ' '){
                // set length to 0 if space is encountered
                len = 0;
            } else
                len++;
        }
        return len;
    }

    public static String getLastWord(String sample){
        String x = sample.trim();

        StringBuilder x_new = new StringBuilder();
        for (int i = 0; i < x.length(); i++){
            if (x.charAt(i) == ' '){
                x_new = new StringBuilder();
            } else{
                // append letter to x_new
                x_new.append(x.charAt(i));
            }

        }
        return x_new.toString();
    }
}


