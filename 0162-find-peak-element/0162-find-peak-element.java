class Solution {
    public int findPeakElement(int[] arr) {
        int len = arr.length;
        for(int i=0;i<len;i++){
            if((i==0 || arr[i-1]<arr[i])&& (i==len-1 || arr[i]>arr[i+1])){
                return i;
            }
        }
        return -1;
    }
}