class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ht = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (ht.containsKey(complement)) {
                return new int[] { i, ht.get(complement) };
            }

            ht.put(nums[i], i);
        }
        return new int[0];
    }
}