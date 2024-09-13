class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0, right=0, maxLen =0, zeroes = 0;
        while(right<nums.length){
            if(nums[right]==0){
                zeroes++;
            }
            while(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            if(zeroes<=k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}