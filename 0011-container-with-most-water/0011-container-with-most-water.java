class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int water = Math.min(height[left], height[right]) * (right - left);
            if (water > maxWater) {
                maxWater = water;
            }
            if (height[left] > height[right]) {
                right--;
            }
            else {
                left++;
            }
        }

        return maxWater;
    }
}