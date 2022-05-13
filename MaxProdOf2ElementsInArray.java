// day 62
//this q doesnt require to find the max prod but we need to check for the max prod each element has with the other elements

public class MaxProdOf2ElementsInArray {
        public int maxProduct(int[] nums) {
            // Arrays.sort(nums);
            // return nums[nums.length-2]*nums[nums.length-1];
            int max=0;
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if((nums[i]-1)*(nums[j]-1)>max)
                        max =(nums[i]-1)*(nums[j]-1);
                }
            }
            return max;
        }
}
