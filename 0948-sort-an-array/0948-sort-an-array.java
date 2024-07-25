import java.util.*;

class Solution {
    public int[] sortArray(int[] nums) {
        // Convert array to ArrayList for easier manipulation
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums) {
            arrayList.add(num);
        }

        // Sort the ArrayList
        Collections.sort(arrayList);

        // Convert ArrayList back to array
        int[] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedArray[i] = arrayList.get(i);
        }

        return sortedArray;
    }
}
