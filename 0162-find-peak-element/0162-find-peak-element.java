class Solution {
    public int findPeakElement(int[] arr) {
        int len = arr.length;
        if(len == 1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[len-1] > arr[len-2]) return len-1;

        int low = 1, high = len-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}