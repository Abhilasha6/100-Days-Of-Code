public class ToLowerCse {
    class Solution {
        public String toLowerCase(String s) {
            String ans="";
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)>'A' && s.charAt(i)<'Z')
                {
                    ans+=Character.toString((char)s.charAt(i)+32);
                }
            return ans;

            
        }
    }
}
