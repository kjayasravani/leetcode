class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = start ^ goal;
        int count = 0;
        while(ans>0){
            if( ans % 2 != 0) count++;
            ans = ans/2;
        }
        if(ans==1) count+=1;
        return count;
    }
}