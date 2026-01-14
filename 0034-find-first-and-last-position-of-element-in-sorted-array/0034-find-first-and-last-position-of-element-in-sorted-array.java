class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1, -1};
        }
        int left = leftTarget(nums, target);
        int right = rightTarget(nums, target);

        return new int[] {left, right};
    }

    public int leftTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int ans = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1; 
            }
        }
        
        return ans;
    }

    public int rightTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int ans = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1; 
            }
        }

        return ans;
    }
}