// day 99 

import java.util.*;
public class ShortEncodingOfWords {
    public int minimumLengthEncoding(String[] words) {
        Set<String> str = new HashSet(Arrays.asList(words)); // copy the words array into set str
        for (String word : words) { // traverse each word in words array
            for (int k = 1; k < word.length(); ++k)
                str.remove(word.substring(k));
            // if a word is a substring of previous word then we remove that repeated word
            // from the set
        }
        int cnt = 0; // counts the length of the encoded word
        for (String word : str) // traverse for each encoded word in str
            cnt += word.length() + 1; // increment the cnt by length of word & +1 for including #
        return cnt;
    }
}
