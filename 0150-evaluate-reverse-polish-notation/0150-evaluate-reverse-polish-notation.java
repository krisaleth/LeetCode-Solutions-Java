class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> tokenStack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!"+-*/".contains(tokens[i])) {
                tokenStack.push(Integer.parseInt(tokens[i]));
            }
            else {
                int num2 = tokenStack.pop();
                int num1 = tokenStack.pop();

                if ("+".equals(tokens[i])) {
                    tokenStack.push(num1 + num2);
                }
                else if ("-".equals(tokens[i])) {
                    tokenStack.push(num1 - num2);
                }
                else if ("*".equals(tokens[i])) {
                    tokenStack.push(num1 * num2);
                }
                else {
                    tokenStack.push(num1 / num2);
                }
             }
        }

        return tokenStack.pop();
    }
}
