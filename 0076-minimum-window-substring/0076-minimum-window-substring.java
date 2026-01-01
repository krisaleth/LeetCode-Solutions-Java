class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> tMap = new HashMap<>();

        for (char n : t.toCharArray()) {
            tMap.put(n, tMap.getOrDefault(n, 0) + 1);
        }

        int counter = tMap.size();
        int index = 0;
        int length = Integer.MAX_VALUE;
        
        int left = 0;
        int right = 0;

        while(right < s.length()) {
            if (tMap.containsKey(s.charAt(right))) {
                tMap.put(s.charAt(right), tMap.get(s.charAt(right)) - 1);
                if (tMap.get(s.charAt(right)) == 0) {
                    counter--;
                }
            }
            while (counter == 0) {
                if (length > right - left + 1) {
                    index = left;
                    length = right - left + 1;
                }
                if (tMap.containsKey(s.charAt(left))) {
                    tMap.put(s.charAt(left), tMap.get(s.charAt(left)) + 1);
                    if (tMap.get(s.charAt(left)) > 0){
                        counter++;
                    }
                }
                left++;
            }
            right++;
        }

        return length == Integer.MAX_VALUE ? "" : s.substring(index, index + length);
    }
}