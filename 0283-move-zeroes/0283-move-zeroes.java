// class Solution {
//     public void moveZeroes(int[] arr) {
//         int l = arr.length;
//         int j = -1 ;
//         int temp;
//         for(int i = 0 ; i<l ; i++){
//             if(arr[i]==0){
//                 j = i;
//                 break;
//             }
//         } 
//         if(j==-1){
//             return;
//         }
//         for(int i = j+1 ; i<l ; i++){
//             if(arr[i] != 0){
//                 temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
//         }
//     }
// }


class Solution {
     public void moveZeroes(int[] nums) {
        int snowBallSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                snowBallSize++; 
            }
            else if (snowBallSize > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-snowBallSize]=t;
            }
        }
    }
}