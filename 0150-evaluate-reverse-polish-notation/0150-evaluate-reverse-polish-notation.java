class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> tokenStack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
                if ("+".equals(tokens[i])) {
                    tokenStack.push(tokenStack.pop() + tokenStack.pop());
                }
                else if ("-".equals(tokens[i])) {
                    int num2 = tokenStack.pop();
                    int num1 = tokenStack.pop();
                    tokenStack.push(num1 - num2);
                }
                else if ("*".equals(tokens[i])) {
                    tokenStack.push(tokenStack.pop() * tokenStack.pop());
                }
                else if ("/".equals(tokens[i])) {
                    int num2 = tokenStack.pop();
                    int num1 = tokenStack.pop();
                    tokenStack.push(num1 / num2);
                }
            else {
                tokenStack.push(Integer.parseInt(tokens[i]));
            }
           
        }

        return tokenStack.pop();
    }
}
