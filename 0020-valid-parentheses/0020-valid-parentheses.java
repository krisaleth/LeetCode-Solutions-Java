class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        int i = 0;
        if (!s.contains(")") && !s.contains("}") && !s.contains("]")) {
            return false;
        }
        while(i < s.length()) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                check.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (check.empty()) {
                    return false;
                }
                else {
                    if (s.charAt(i) == ')' && check.peek() == '(' ||
                    s.charAt(i) == ']' && check.peek() == '[' ||
                    s.charAt(i) == '}' && check.peek() == '{') { 
                        check.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
            i++;
        }
        if (check.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
}