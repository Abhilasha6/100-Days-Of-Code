//day 28 Q1
class ReverseString {
    public void reverseString(char[] s) {
        char ch; int i=s.length-1;
        
                for(int j=0;j<s.length/2;j++,i--)
                {
                   ch=s[j];
                   s[j]=s[i];
                   s[i]=ch;
                }
       
    }
}