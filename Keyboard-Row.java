//day 41
// answer correct but review the question again.

public class Keyboard-Row {
    public String[] findWords(String[] words) {
        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        List<String> results = new ArrayList();
        
        for (String word : words) {
            int count1 = 0, count2 = 0, count3 = 0;
            
            for (char c : word.toCharArray()) {
                if (strs[0].toLowerCase().indexOf(c) != -1) 
                    count1++;
                if (strs[1].toLowerCase().indexOf(c) != -1) 
                    count2++;
                if (strs[2].toLowerCase().indexOf(c) != -1) 
                    count3++;             
            }
            if ((count1 == 0 && count2 == 0) || (count1 == 0 && count3 == 0) || (count2 == 0 && count3 == 0))
                results.add(word);           
        }
        
        return results.toArray(new String[results.size()]);
    }
}
