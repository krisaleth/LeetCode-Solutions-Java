class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs.length == 0) {
            return "";
       }

       String longestStr = strs[0];

       for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(longestStr)) {
                longestStr = longestStr.substring(0, longestStr.length() - 1);
            }
       }

       return longestStr;


    }
}