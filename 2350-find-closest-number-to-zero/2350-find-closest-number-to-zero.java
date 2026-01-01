class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Math.abs(nums[0]);
        int value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < min) {
                min = Math.abs(nums[i]);
                value = nums[i];
            }
            else if (Math.abs(nums[i]) == min) {
                if (nums[i] > value) {
                    value = nums[i];
                }
            }
        }
        return value;
    }
}