class Solution {
    public int hammingWeight(int n) {
        int count =0;
        while (n > 0) {
            if (n % 2 == 1) { // Check if the last bit is 1
                count++;
            }
            n = n / 2; // Shift right by dividing by 2
        }
        return count;
    }
}