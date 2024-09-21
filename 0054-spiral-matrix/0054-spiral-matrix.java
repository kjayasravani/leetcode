class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralArr = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, left = 0, right = m-1, bottom = n-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                spiralArr.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                spiralArr.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i= right;i>=left;i--){
                    spiralArr.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    spiralArr.add(matrix[i][left]);
                }
                left++;
            }

        }
        return spiralArr;
    }
}