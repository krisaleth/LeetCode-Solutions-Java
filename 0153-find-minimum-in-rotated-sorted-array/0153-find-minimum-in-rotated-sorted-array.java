class Solution {
    public int findMin(int[] nums) {
        int mim = Integer.MAX_VALUE;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[right] >= nums[left]) {
                return nums[left];
            }
            else if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return 0;
    }
}