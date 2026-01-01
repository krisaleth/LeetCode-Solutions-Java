class Solution {
    public int characterReplacement(String s, int k) {
        int[] orcurance = new int[26];

        int left = 0;
        int ans = 0;
        int maxOrcurance = 0;

        for (int right = 0; right < s.length();right++) {
            maxOrcurance = Math.max(maxOrcurance, ++orcurance[s.charAt(right) - 'A']);
            if (right - left + 1 - maxOrcurance > k) {
                orcurance[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}