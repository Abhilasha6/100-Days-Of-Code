//day 63

public class SortingTheSequence {
        public String sortSentence(String s) {
            s+=" "; int j=1; 
            String word[]=s.split(" ");
            String []ans=new String[word.length];
            for(String elem:word)
            {
                // while(j<10)
                // {
                //     if(word.charAt(word.length-1)==j)
                //         ans+=word;
                //     j++;
                // }
                
                ans[elem.charAt(elem.length()-1)-'1']=elem.substring(0,elem.length()-1);
    
            }
            // return ans;
            return String.join(" ",ans);
    
        }
}
