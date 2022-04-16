//day 36

public class NumberOfSegmentsInString {
    class Solution {
        public int countSegments(String s) {
            int c=1;
            s=s.trim();
            if(s.length()==0)
                return 0;
            else{
                //this method will work for all words when there are no special sequences/ escape sequences                
                 for(int i=0;i<s.length();i++)
            {
                if((s.charAt(i))==' ')
                    c++;
                else
                    continue;
            }
            return c;
            }      
        }
    }
}
