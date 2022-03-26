//day16
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int cnt;
        for(int i=0;i<nums.length;i++)
        {
            cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                cnt++;
            }
            }
           if(cnt>nums.length/2)
               return nums[i];
        }
        return 0;
    }
}
