class Solution {
    public int singleNonDuplicate(int[] arr) {
        int len = arr.length;
        if(len==1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[len-1] != arr[len-2]) return arr[len-1];

        int low = 1, high = len - 2;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            else if((mid % 2 != 0 && arr[mid-1]==arr[mid]) ||
            (mid % 2 ==0 && arr[mid+1]==arr[mid])){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}