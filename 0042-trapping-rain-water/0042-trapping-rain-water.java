class Solution {
    public int trap(int[] height) {
        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;
        
        int[] left = new int [height.length];
        int[] right = new int [height.length];

        int totalWater = 0;

        for (int i = 0; i < left.length; i++) {
            maxLeft = Math.max(maxLeft, height[i]);
            left[i] = maxLeft;
        }

        for (int i = right.length - 1; i >=0; i--) {
            maxRight = Math.max(maxRight, height[i]);
            right[i] = maxRight;
        }

        for (int i = 0; i < height.length; i++) {
            totalWater += Math.min(left[i], right[i]) - height[i];
        }

        return totalWater;
    }
}
