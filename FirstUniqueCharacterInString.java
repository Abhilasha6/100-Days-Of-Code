//day 31

public class FirstUniqueCharacterInString {
     public int firstUniqChar(String s) {
        // for(int i=0;i<s.length();i++)
        // {
        //     char str=s.charAt(i);
        //     s=s.replaceFirst(Character.toString(s.charAt(i)),"");
        //     if(s.contains(Character.toString(str)))
        //     {
        //         continue;
        //     }
        //     else
        //         return i;
        // }
        // return -1;
        
        
         for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    break;
                }
                else if(j==s.length()-1) 
                    return i;
            }
        }
        return -1;
    }
}
