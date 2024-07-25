class Solution {
    public int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length]; // Temporary array for merging
        mergeSort(nums, temp, 0, nums.length - 1);
        return nums;
    }
    
    private void mergeSort(int[] nums, int[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(nums, temp, left, mid); // Sort left half
            mergeSort(nums, temp, mid + 1, right); // Sort right half
            merge(nums, temp, left, mid, right); // Merge sorted halves
        }
    }
    
    private void merge(int[] nums, int[] temp, int left, int mid, int right) {
        // Copy elements into temp array
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }
        
        // Merge sorted halves from temp array back into nums array
        int i = left; // Initial index for left subarray
        int j = mid + 1; // Initial index for right subarray
        int k = left; // Initial index for merged subarray
        
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of left subarray if any
        while (i <= mid) {
            nums[k] = temp[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of right subarray if any
        while (j <= right) {
            nums[k] = temp[j];
            j++;
            k++;
        }
    }
}
