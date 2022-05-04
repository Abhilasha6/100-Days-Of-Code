//day 52 review again

class shortestCompletingWord{
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] freq = new int[26];
        
        for(char ch : licensePlate.toCharArray()){
            if(Character.isDigit(ch) || ch == ' ') continue;
            freq[Character.toLowerCase(ch)-'a']++;
        }
    
        
        String ans = "";
        for(String w : words){
            int curr[] = new int[26];
            for(char ch : w.toCharArray()){
                if(freq[Character.toLowerCase(ch)-'a'] != 0){
                    curr[Character.toLowerCase(ch)-'a']++;
                }
            }
            boolean flag = true;
            for(int i = 0; i < 26;i++){
                if(curr[i] < freq[i]){//FREQ FOR CHAR IN WORD CAN BE GREATER BUT NOT SMALLER THAN LP
                    flag = false;
                    break;
                }
            }
    
            if(ans == "" && flag == true){
                ans += w;
            }
            
            if(flag == true && w.length() < ans.length()){//WE WANT THE SMALLEST ONE SO UPDATE
                ans = new String();
                ans += w;
            }
            
        }
        return ans;
    }
}
