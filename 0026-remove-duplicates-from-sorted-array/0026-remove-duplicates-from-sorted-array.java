// class Solution {
//     public int removeDuplicates(int[] arr) {
//         int i=0;
//         for(int j=0;j<arr.length;j++){
//             if(arr[j] != arr[i]){
//                 arr[i+1] = arr[j];
//                 i++;
//             } 
//         } 
//         return i+1; 
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}