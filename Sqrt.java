public class Sqrt() {
    class Solution {
        public int mySqrt(int x) {
            double root=-1,i=0,j=x,k;
            // for(int i=1;i<n/2;i++)
            //     if(i*i==n)
            //         return i;
            if(x==1) return 1;
            do{
                k=i + (j-i)/2;
                if(k*k==x)
                    return (int)k;
                else if(k*k<x){
                    root=k;
                    i=k+1;
                }
                else
                    j=k-1;
            }while(i<=j);
            return (int)root;
            
           
        }
    }
}
