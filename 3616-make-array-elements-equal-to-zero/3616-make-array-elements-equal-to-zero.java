class Solution {
    public int countValidSelections(int[] nums) {
        int ans = 0;
        int sum = 0;

        for (int x : nums) {
            sum += x;
        }
        int totalLeft = 0;
        int totalRight = sum;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                if (totalLeft - totalRight >= 0 && totalLeft - totalRight <= 1) {
                    ans++;
                }
                if (totalRight - totalLeft >= 0 && totalRight - totalLeft <= 1) {
                    ans++;
                }
            }
            else {
                totalLeft += nums[i];
                totalRight -= nums[i];
            }
        }

        return ans;
    }
}