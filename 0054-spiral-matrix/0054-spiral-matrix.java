class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n - 1;
        int right = m - 1;
        int left = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i < right+1; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i < bottom+1; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for(int i = right; i > left-1; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i > top-1; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
        }

        return result;
    }
}