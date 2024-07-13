class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, len = nums.length, high = len-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]==target) return true;

            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = low+1;
                high = high-1;
                continue;
            }

            // left sorted
            if(nums[low]<= nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

            // right sorted
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}