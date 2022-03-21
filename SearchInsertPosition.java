public class SearchInsertPosition {
        public int searchInsert(int[] nums, int target) {
            int i;
            if(target>nums[nums.length-1])
                return nums.length;
            if(target<nums[0])
                return 0;
         for( i=0;i<nums.length;i++){
             if(nums[i]==target)
                 return i;
             // if(i>nums[nums.length-1])
             //     return nums.length;
             if(i<nums.length-1 && target>nums[i] && target<nums[i+1]){
                 // if(i+1<nums.length-2)
                 return i+1;
             }
        
         }
           
            return 0;
        }
}
