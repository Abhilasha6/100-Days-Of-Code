//day 59 q1

public class DIstringMatch {
        public int[] diStringMatch(String s) {
            // int[] perm=new int[s.length()];
            int val=s.length(); int j=0,i;
            int[] ans=new int[s.length()+1];
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='I')
                {
                    ans[i]=j;
                    j++;
                }
                else if(s.charAt(i)=='D')
                {
                    ans[i]=val;
                    val--;
                }
            }
            if(s.charAt(i-1)=='I')
                ans[i]=j;
            else
                ans[i]=val;
            return ans;
        }
}
