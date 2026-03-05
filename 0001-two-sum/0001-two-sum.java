class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ht = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            ht.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (ht.containsKey(complement) && ht.get(complement) != i) {
                return new int[] { i, ht.get(complement) };
            }
        }
        return new int[0];
    }
}