//day 31

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++)
        {
            char str=s.charAt(i);
            s=s.replaceFirst(Character.toString(s.charAt(i)),"");
            if(s.contains(Character.toString(str)))
            {
                continue;
            }
            else
                return i;
        }
        return -1;
        
    }
}
