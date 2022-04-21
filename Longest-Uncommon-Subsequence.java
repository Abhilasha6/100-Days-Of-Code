// day 40

public class Longest-Uncommon-Subsequence {
        public int findLUSlength(String a, String b) {
            if(a.equals(b)) 
            return -1;
            else 
            return Math.max(a.length(),b.length());    
        }
    }
}
