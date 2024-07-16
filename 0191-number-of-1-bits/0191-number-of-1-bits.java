class Solution {
    public int hammingWeight(int n) {
        int count=1;
        while(n>1){
            count += n & 1;
            n = n>>1;
        }
        return count;
    }
}