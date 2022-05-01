//day 50

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        for(int i=0;i<stones.length();i++)
        {
            for(int j=0;j<jewels.length();j++)
            {
                if(stones.charAt(i)==jewels.charAt(j))
                {
                    cnt++;
                    // jewels=jewels.replace(jewels.charAt(i));
                }
            }
        }
        return cnt;
    }
}
