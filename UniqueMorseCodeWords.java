public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
         String[] morse ={".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        String arr[]=new String[26];
        int c=0; // final length of arr
        for(String s:words) //iterate through each word in words array
        {
            String str="";
            for(int i=0;i<s.length();i++)//iterate through each character of the particular word
            {
                str+=morse[s.charAt(i)-97]; //this gives us the index position of the character in the morse code array.
                
            }
            arr[c++]=str;
        }
        return c;
    }
}
