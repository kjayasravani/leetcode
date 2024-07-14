class Solution {
    public int singleNonDuplicate(int[] arr) {
        int len = arr.length;
        for(int i=0;i<len; i++){
            if(len==1){
                return arr[0];
            }
            if(i==0){
                if(arr[i] != arr[i+1]){
                    return arr[0];
                }
            }
            else if(i == len-1){
                if(arr[i] != arr[i-1]){
                    return arr[i];
                }
            }
            else{
                if(arr[i]!= arr[i+1] && arr[i]!=arr[i-1]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}