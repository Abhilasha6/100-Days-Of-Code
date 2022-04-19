//day 38

public class DetectCapital {
    class Solution {
    public boolean detectCapitalUse(String word) {
        char arr[]= word.toCharArray();
        int c=0;
        int x=0;
        
        for(int i=0;i<arr.length;i++)
            {
            if(arr[i]>=65 && arr[i]<=90)
                c++;
            }
        if(c==0 || c==arr.length)
            return true;
        
        if(arr[0]>=65 && arr[0]<=90){
             for(int i=1;i<arr.length;i++){
                if((arr[i]>=65 && arr[i]<=90))
                    return false;
          }
            x=1;
        }       
         if(x==1)
            return true;
       
        return false;
    }
}
}
