// day 89
//j counts the normal iteration 
// i helps us to remove the previous occurence of the subsequent repeated character 
//try to understand the use of the 2 variables

import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
        public int lengthOfLongestSubstring(String s) {
            // char[] ch=s.toCharArray();
            // String lis="";
             int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<Character>();
        
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } 
            else {
                set.remove(s.charAt(i++));
            }
        }
        
        return max;
     }
    }
