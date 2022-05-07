public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int[] ans=new int[s.length()];
        int dist=10000;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c){
                dist=i;
            }
                ans[i]=i-dist;
        }
        dist=10000;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==c){
                dist=i;
            }
            ans[i]=Math.min(ans[i],dist-i);
                    
        }
        return ans;
    }


   
}
