class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int low=0, high = len - 1, ans = len;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}