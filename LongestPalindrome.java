//day 34

public class LongestPalindrome {
    public int longestPalindrome(String s) {
    
        char[] c = s.toCharArray();
        int j = 0;
        Arrays.sort(c);
        
        if(c.length == 1)
            return 1;
        
        for(int i = 0; i < c.length - 1; i++)
        {
            if(c[i] == c[i+1])
            {
                j += 2;
                i += 1;
            }
        }
        
        if(j < c.length)
            j += 1;
        
        return j;
    }
}
