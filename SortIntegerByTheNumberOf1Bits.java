//day 67
//review again

public class SortIntegerByTheNumberOf1Bits {
        public int[] sortByBits(int[] arr) {
            int n = arr.length;
            int result[] = new int[n];
            // Sort based on the hamming weight 
            // and if the hamming weight is same then sort it based on its integer value
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                        int w1 = hammingWt(a);
                        int w2 = hammingWt(b);
                        if (w1 == w2) {
                            return a - b;
                        }
                        return w1 - w2;
                    }
                });
           
            int ind = 0;
            for (int i = 0; i < n; i++) {
                minHeap.add(arr[i]); 
            }
            while (minHeap.size() > 0) {
                int num = minHeap.poll();
                result[ind++] = num;
            }
            return result;
        }
        
        // Calculate the hamming weight for each Integer
        private int hammingWt(int num) {
            int wt = 0;
            while (num > 0) {
                wt++;
                num = num & (num - 1);
            }
            return wt;
        }
}
