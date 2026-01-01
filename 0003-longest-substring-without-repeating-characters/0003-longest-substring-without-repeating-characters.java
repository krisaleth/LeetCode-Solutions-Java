class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> sub = new HashSet<>();

        int left = 0;
        int right = 0;
        int ans = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            while(sub.contains(c)) {
                sub.remove(s.charAt(left));
                left++;
            }
            sub.add(c);
            ans = Math.max(ans, sub.size());
            right++;
        }

        return ans;

    }
}