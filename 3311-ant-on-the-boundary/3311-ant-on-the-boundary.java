class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
            count += nums[i];
        }
            else if(nums[i]<0){
            count += nums[i];
        }

            if(count==0){
            ans++;
        }
        }    
        return ans+1;
    }
}