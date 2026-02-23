class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int res = Math.min(heights[left], heights[right]) * (right - left);
            max = Math.max(max, res);

            if (heights[left] >= heights[right]) {
                right--;
            }
            else {
                left++;
            }
        }

        return max;
    }
}
