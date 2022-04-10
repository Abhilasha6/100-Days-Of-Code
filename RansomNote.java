public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        //this would be useful if we were to find a particular substring/set of concatinated letters/words
        // boolean ans= magazine.contains(ransomNote);
        // return ans;

        //traversing through both strings
        String s = "";
        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0; j < magazine.length(); j++) {
                char ch = magazine.charAt(j);
                if (ransomNote.charAt(i) == magazine.charAt(j)) {
                    s += magazine.charAt(j);
                    magazine = magazine.replaceFirst(Character.toString(ransomNote.charAt(i)), "");
                    break;
                }
            }
        }
        if (s == ransomNote)
            return true;
        return false;

    }
}
