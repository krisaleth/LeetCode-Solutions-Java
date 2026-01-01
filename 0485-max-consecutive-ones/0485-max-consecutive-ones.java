class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int r = 0;
        int max = Integer.MIN_VALUE;
        int n = 0;

        while(r < nums.length) {
            if (nums[r] == 1) {
                n++;
            }
            if (nums[r] == 0 || r + 1 == nums.length) {
                if (max < n) {
                    max = n;
                }
                n = 0;
                l = r;
            }
            r++;
        }

        return max;
    }
}