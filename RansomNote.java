//day 30

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        //this would be useful if we were to find a particular substring/set of concatinated letters/words
        // boolean ans= magazine.contains(ransomNote);
        // return ans;

        String s="";
        for(int i = 0; i < ransomNote.length(); i++){
            if(magazine.contains(Character.toString(ransomNote.charAt(i)))){
              s+=ransomNote.charAt(i);  
              magazine = magazine.replaceFirst(Character.toString(ransomNote.charAt(i)),"");
            }
            if(s.equals(ransomNote))
                return true;
        }
        return false;

    }
}
