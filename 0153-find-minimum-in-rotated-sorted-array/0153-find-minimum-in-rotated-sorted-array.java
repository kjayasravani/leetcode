class Solution {
    public int findMin(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[ans]){
                ans = i;
            }
        }
        return nums[ans];
    }
}