public class Longest-Uncommon-Subsequence {
        public int findLUSlength(String a, String b) {
            if(a.equals(b)) 
            return -1;
            else 
            {
                String s="";
                int c=0;
                for(int i=0;i<a.length();i++)
                {
                    if(b.contains(Character.toString(a.charAt(i))))
                    {
                        c++;
                        s+=Character.toString(a.charAt(i));
                    }
                }
                if(s==null)
                    return a.length();
                else
                return c;
            }
         
        }
    }
}
