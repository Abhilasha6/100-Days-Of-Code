public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        // String st="";
        int llw=0;
        int k= s.lastIndexOf(" ");
        for(int i=s.length()-1; i>=0;i--)
        {
            // st=st+s.charAt(i);
            if(s.charAt(i)!=' ')
                llw++;
            else
                break;
        }
        // return st.trim().length();
        return llw;
        
    }
}
