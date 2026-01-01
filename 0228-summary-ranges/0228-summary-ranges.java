class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        int rangeStart = nums[0];
        int rangeEnd = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                rangeEnd = nums[i];
            }
            else {
                if (rangeEnd != rangeStart) {
                    result.add(Integer.toString(rangeStart) + "->" + Integer.toString(rangeEnd));
                }
                else {
                    result.add(Integer.toString(rangeStart));
                }
                rangeStart = nums[i];
                rangeEnd = nums[i];
            }
        }
        if (rangeEnd != rangeStart) {
            result.add(Integer.toString(rangeStart) + "->" + Integer.toString(rangeEnd));
        }
        else {
            result.add(Integer.toString(rangeStart));
        }
        return result;
    }
}