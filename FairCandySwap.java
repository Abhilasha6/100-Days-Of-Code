//day 72
//review again ... medium diff

public class FairCandySwap {
        public int[] fairCandySwap(int[] A, int[] B) {
             int sa = 0, sb = 0;  
            for (int x: A) 
                sa += x;
            for (int x: B) 
                sb += x;
            int delta = (sb - sa) / 2;
    
            Set<Integer> setB = new HashSet();
            for (int x: B) 
                setB.add(x);
    
            for (int x: A)
                if (setB.contains(x + delta))
                    return new int[]{x, x + delta};
    
        return null;
        }
}
