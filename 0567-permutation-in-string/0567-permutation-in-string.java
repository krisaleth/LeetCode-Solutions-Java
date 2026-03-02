class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] sChar = new int[26];
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            sChar[s1.charAt(i) - 'a']++;
            sChar[s2.charAt(i) - 'a']--;
        }

        for (int s : sChar) {
            if (s == 0) {
                count++;
            }
        }

        if (count == 26) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) { 
            int right = s2.charAt(i) - 'a';
            if (sChar[right] == 0) count--; 
            sChar[right]--;                 
            if (sChar[right] == 0) count++; 

            int left = s2.charAt(i - s1.length()) - 'a';
            if (sChar[left] == 0) count--; 
            sChar[left]++;                 
            if (sChar[left] == 0) count++;
            
            if (count == 26) {
                return true;
            }
        }

        return false;
    }
}
