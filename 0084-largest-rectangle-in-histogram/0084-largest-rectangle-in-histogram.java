// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int l = heights.length;
//         int[] nextSmall = new int[l];
//         for(int i=0;i<l;i++){
//             for(int j=1;j<l;j++){
//                 if(heights[j]<heights[i]){
//                     nextSmall[i] = j;
//                     break;
//                 }
//                 else{
//                     nextSmall[i] = 9;
//                 }
//             }
//         }

//         int[] prevSmall = new int[l];
//         for(int i=0;i<l;i++){
//             for(int j=0;j<i;j++){
//                 if(heights[j]<heights[i]){
//                     prevSmall[i] = j;
//                 }
//                 else{
//                     nextSmall[i] = -1;
//                 }
//             }
//         }

//         int[] wid = new int[l];
//         for(int i=0;i<l;i++){
//             wid[i] = nextSmall[i] - prevSmall[i] - 1;
//         }

//         int max =wid[0];
//         for(int i=0;i<l;i++){
//             if(wid[i]> max){
// //                 max = wid[i];
// //             }
// //         }
// //         return max;
// //     }
// // }

// import java.util.Stack;

// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int l = heights.length;
//         int[] leftBoundary = new int[l];
//         int[] rightBoundary = new int[l];

//         // Arrays to store the nearest left and right boundaries
//         Stack<Integer> stack = new Stack<>();
        
//         // Calculate left boundaries
//         for (int i = 0; i < l; i++) {
//             while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
//                 stack.pop();
//             }
//             leftBoundary[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
//             stack.push(i);
//         }
        
//         // Clear the stack for re-use
//         stack.clear();
        
//         // Calculate right boundaries
//         for (int i = l - 1; i >= 0; i--) {
//             while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
//                 stack.pop();
//             }
//             rightBoundary[i] = stack.isEmpty() ? l : stack.peek();
//             stack.push(i);
//         }
        
//         // Calculate the maximum area
//         int maxArea = 0;
//         for (int i = 0; i < l; i++) {
//             int width = rightBoundary[i] - leftBoundary[i];
//             int area = heights[i] * width;
//             if (area > maxArea) {
//                 maxArea = area;
//             }
//         }

//         return maxArea;
//     }
// }
public class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        return getMax(heights, 0, heights.length);
    }    
    int getMax(int[] heights, int s, int e) {
        if (s + 1 >= e) return heights[s];
        int min = s;
        boolean sorted = true;
        for (int i = s; i < e; i++) {
            if (i > s && heights[i] < heights[i - 1]) sorted = false;
            if (heights[min] > heights[i]) min = i;
        }
        if (sorted) {
            int max = 0;
            for (int i = s; i < e; i++) {
                max = Math.max(max, heights[i] * (e - i));
            }
            return max;
        }
        int left = (min > s) ? getMax(heights, s, min) : 0;
        int right = (min < e - 1) ? getMax(heights, min + 1, e) : 0;
        return Math.max(Math.max(left, right), (e - s) * heights[min]);
    }
}