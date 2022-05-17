//day 66

public class SquaresOfSortedArray {
        public int[] sortedSquares(int[] nums) {
            int sq[]=new int[nums.length];
            for(int i=0;i<nums.length;i++)
                sq[i]=nums[i]*nums[i];
            Arrays.sort(sq);
            return sq;
        }
}
