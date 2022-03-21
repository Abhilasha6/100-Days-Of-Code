public class NumberOf1Bits {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int c=0;
            // int i=1;
            // while(i<=32)
            // {
            //     if(n%10==1)
            //     {
            //        c++;
            //         n=n/10;
            //     }
            //     i++;
            // }
            // return  c;
            String s=Integer.toBinaryString(n);
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='1')
                    c++;
            }
            return c;
        }
    }
}
