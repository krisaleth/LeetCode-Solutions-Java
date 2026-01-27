class Solution {
    public int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 0;

        if (n <= 2) {
            return n;
        }

        for (int i = 0; i < n; i++) {
            int cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return prev1;
    }
}