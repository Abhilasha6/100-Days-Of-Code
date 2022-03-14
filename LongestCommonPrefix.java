public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String lcp="";
            char k;
            int n=strs.length;
            //we need to find the minimum length element in the array
            int min = strs[0].length();
            for (int i = 1; i < n; i++)
            {
                if (strs[i].length() < min)
                {
                    min = strs[i].length();
                }
            }
            
            for(int i=0;i<min;i++)
            {
                k=strs[0].charAt(i);
                for(int j=1;j<n;j++)
                {
                    if(k!=strs[j].charAt(i))
                        return lcp;
                        // lcp+=k;
                }
                lcp+=k;
            }
            return lcp;
        }
    }
}
