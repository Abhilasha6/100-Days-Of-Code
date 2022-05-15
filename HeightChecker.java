//day 64

public class HeightChecker {
        public int heightChecker(int[] heights) {
            int[] check=new int[heights.length];
            
            for(int i=0;i<heights.length;i++)
                check[i]=heights[i];
            Arrays.sort(check);
            
            int pos=0;
            for(int i=0;i<check.length;i++)
            {
                if(heights[i]!=check[i])
                    pos++;
            }
            return pos;
        }
}
