class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();

        for (char s : s1.toCharArray()) {
            s1Map.put(s, s1Map.getOrDefault(s, 0) + 1);
        }

        for (int i = 0; i < s1.length(); i++) {
            s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        int head = 0;
        int tail = s1.length() - 1;

        while (tail < s2.length()) {
            if (s1Map.equals(s2Map)) {
                return true;
            }
            if (s2Map.get(s2.charAt(head)) > 1) {
                s2Map.put(s2.charAt(head), s2Map.get(s2.charAt(head)) - 1);
            }
            else {
                s2Map.remove(s2.charAt(head));
            }
            if (tail + 1 < s2.length()) {
                s2Map.put(s2.charAt(tail + 1), s2Map.getOrDefault(s2.charAt(tail + 1), 0) + 1);
            }
            head++;
            tail++;
        }

        return false;
    }
}