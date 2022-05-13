
public class MaxProdOf2ElementsInArray {
        public int maxProduct(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length-2]*nums[nums.length-1];
           
        }
}
