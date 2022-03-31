//day 21
public class MoveZeroes {
        public void moveZeroes(int[] nums) {
            int cnt=0,i,temp,j=0;
            for(i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                {
                    temp=nums[i];
                    for( j=0;j<nums.length;i++)
                        if(nums[j]!=0){
                            nums[i]=nums[j];
                            nums[j]=temp;
                            break;
                        }
                    
                }
                else
                    continue;
            }
            // return nums;
        }
    
}
