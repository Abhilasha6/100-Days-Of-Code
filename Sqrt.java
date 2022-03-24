public class Sqrt() {
    class Solution {
        public int mySqrt(int x) {
            // double root=-1,i=0,j=x,k;
            // for(int i=1;i<n/2;i++)
            //     if(i*i==n)
            //         return i;

            // if(x==1) return 1;
            // do{
            //     k=i + (j-i)/2;
            //     if(k*k==x)
            //         return (int)k;
            //     else if(k*k<x){
            //         root=k;
            //         i=k+1;
            //     }
            //     else
            //         j=k-1;
            // }while(i<=j);
            // return (int)root;
            
        int i = 1;
        int j = x / 2;
        
        // we need to chechk weather the lower Limt and hiher limit are equal
        while(i <=  j) {
            // we find the mid of both by using binary search
            int mid = (i + j ) / 2;
            
            // now we need to check weather the mid is greater the x/mid
            if(mid > x / mid) {
                
                j = mid - 1;
                continue;
            } 
            // otherwise we need to check mid + 1 < x/ mid + 1
            else if( (mid + 1) <= x/(mid + 1)) {
                // if the condition satisifies increment the lower limit to mid + 1
                i = mid + 1;
                continue;
            }
            return mid;
        }
        return x;
        }
    }
}
