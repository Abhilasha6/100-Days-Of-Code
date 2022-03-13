class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,d=0;
        int dup=x;
        if(x<0)
            return false;
        while(x!=0)
        {
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(rev==dup)
            return true;
        else
            return false;
    }
}