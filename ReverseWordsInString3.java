//day 44

public class ReverseWordsInString3 {
    public String reverseWords(String s) {
        //Strings in java are immutable, so I have to work with StringBuilder
        String[] words = s.split(" ");
        
        StringBuilder reversed = new StringBuilder();
        for(String word : words){
            for(int i=word.length()-1;i>=0;i--){
                reversed.append(word.charAt(i));
            }
            reversed.append(" ");
        }
        //delete the last space
        reversed.deleteCharAt(reversed.length()-1);
        return reversed.toString();
    }
}
