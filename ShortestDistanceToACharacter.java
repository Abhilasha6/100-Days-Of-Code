//day 56

public class ShortestDistanceToACharacter {
//     public int[] shortestToChar(String s, char c) {
//         int[] ans=new int[s.length()];
//         int dist=10000;
//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)==c){
//                 dist=i;
//             }
//                 ans[i]=i-dist;
//         }
//         dist=10000;
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             if(s.charAt(i)==c){
//                 dist=i;
//             }
//             ans[i]=Math.min(ans[i],dist-i);
                    
//         }
//         return ans;
//     }


    public int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ans = new int[N];
        int prev = -N;

        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == C) 
                prev = i;
            ans[i] = i - prev;
        }

        prev = 2*N;
        for (int i = N-1; i >= 0; --i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }
}
