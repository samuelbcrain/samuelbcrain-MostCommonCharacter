import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        char charToAdd = ' ', result = ' ';

        // for all chars in string
        for (int i = 0; i < str.length(); i++) {
            charToAdd = str.charAt(i);
            // if char NOT in hashmap, add to hashmap
            if (!charCount.containsKey(charToAdd)) {
                charCount.put(charToAdd, 1);
            }
            // if char IS in hashmap, increase count
            else {
                charCount.put(charToAdd, charCount.get(charToAdd) + 1);
            }
        }

        result = str.charAt(0);
        // for all chars in hashmap
        for (char c : charCount.keySet()) {
            // if larger count found than current result, set new result
            if (charCount.get(c) > charCount.get(result)) {
                result = c;
            }
        }

        return result;
    }
}
