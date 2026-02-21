class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i-1]) {
                twoSum(nums, i, res);
            }
        }
        return res;
    }

    void twoSum(int[] nums, int i, List<List<Integer>> res) {
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int ans = nums[i] + nums[left] + nums[right];

            if (ans > 0) {
                right--;
            }
            else if (ans < 0) {
                left++;
            }
            else {
                res.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                while (left < right && nums[left] == nums[left-1]) {
                    ++left;
                }
            }
         }
    }
}
