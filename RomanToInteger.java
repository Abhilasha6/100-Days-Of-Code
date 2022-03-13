class Solution {
    public int romanToInt(String s) {
        int sum=0,add=0;
        char val;
        for(int i=s.length()-1;i>=0;i--)
        {
            val=s.charAt(i);
            if(val=='I')
                add=1;
            else if(val=='V')
                add=5;
            else if(val=='X')
                add=10;
            else if(val=='L')
                add=50;
             else if(val=='C')
                 add=100;
             else if(val=='D')
                 add=500;
             else if(val=='M')
                 add=1000;
                // sum=sum+1000;
            
            if(4*add<sum)
                sum=sum-add;
            else
                sum=sum+add;
        }
        return sum;
    }
}
