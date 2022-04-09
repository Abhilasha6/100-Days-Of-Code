public class HappyNumber {
    class Solution {
        public boolean isHappy(int n) {
            if(n==1||n==7)
                return true;
            else if(n<10 && n>1)
                return false;
            else
             return sod(n);
            return false;
        }
        
        //finding digits & sum of squares of digits
        public static boolean sod(int x){
           if (x==1 || x==7)
                return true;
            else if(x<10 && x>1)
                return false;
            int d,ss=0;
            for(int i=0;x>0;i++)
            {
                d=x%10;
                ss=ss+d*d;
                x=x/10;
            }
            x=ss;
            return sod(x);
        } 
    }
}
