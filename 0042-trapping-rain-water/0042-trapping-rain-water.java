class Solution {
    public int trap(int[] height) {
        int[] maxLeftArr = new int[height.length];
        int[] maxRightArr = new int[height.length];
        int maxLeft = Integer.MIN_VALUE;
        int maxRight = Integer.MIN_VALUE;
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            if (maxLeft < height[i]) {
                maxLeft = height[i];
            }
            maxLeftArr[i] = maxLeft;
        }

        for (int i = height.length - 1; i >= 0; i--) {
            if (maxRight < height[i]) {
                maxRight = height[i];
            }
            maxRightArr[i] = maxRight;
        }

        for (int i = 0; i < height.length; i++) {
            water += Math.min(maxLeftArr[i], maxRightArr[i]) - height[i];
        }

        return water;
    }
}