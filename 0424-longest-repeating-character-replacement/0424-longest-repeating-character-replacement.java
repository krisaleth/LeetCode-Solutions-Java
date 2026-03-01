class Solution {
    public int characterReplacement(String s, int k) {
        int begin = 0;
        int[] box = new int[26];
        int res = 0;
        int maxCount = 0;
        int maxLength = 0;
        for (int end = 0; end < s.length(); end++) {
            box[s.charAt(end) - 'A']++;

            maxCount = Math.max(maxCount, box[s.charAt(end) - 'A']);

            while ((end - begin + 1) - maxCount > k) {
                box[s.charAt(begin) - 'A']--;
                begin++;
            }

            maxLength = Math.max(maxLength, end - begin + 1);
        }

        return maxLength;
    }
}
