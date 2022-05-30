// day 79
//optimise my solution, review again 

public class Divide2Integers {
    // class Solution {
    // public int divide(int dividend, int divisor) {
    // int q=0;
    // if(dividend<0 || divisor<0){
    // String pre="-";

    // if(dividend >0 && divisor >0){
    // while(dividend >= divisor)
    // {
    // dividend-=divisor;
    // q++;
    // }
    // }
    // else{
    // while(Math.abs(dividend) >= Math.abs(divisor))
    // {
    // dividend=Math.abs(dividend - divisor);
    // q++;
    // }
    // pre+=Integer.toString(q);
    // return Integer.parseInt(pre);
    // }

    // else{
    // while(dividend >= divisor)
    // {
    // dividend-=divisor;
    // q++;
    // }
    // }
    // return q;
    // }

    public int divide(int A, int B) {
        if (A == 1 << 31 && B == -1)
            return (1 << 31) - 1;
        int a = Math.abs(A), b = Math.abs(B), res = 0, x = 0;
        while (a - b >= 0) {
            for (x = 0; a - (b << x << 1) >= 0; x++)
                ;
            res += 1 << x;
            a -= b << x;
        }
        return (A > 0) == (B > 0) ? res : -res;
    }

}
