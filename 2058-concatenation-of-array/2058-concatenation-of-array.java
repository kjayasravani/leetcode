class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] output = new int[2*l];
        for(int i=0;i<l;i++){
            output[i] = nums[i];
            output[i+l] = nums[i];
        }
        return output;
    }
}