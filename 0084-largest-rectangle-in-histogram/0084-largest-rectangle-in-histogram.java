class Solution {
    public int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] nextS = new int[n];
        for (int i = 0; i < n; i++) {
            nextS[i] = n;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                nextS[st.pop()] = i;
            }
            st.push(i);
        }

        return nextS;
    }

    public int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] prevS = new int[n];
        for (int i = 0; i < n; i++) {
            prevS[i] = -1;
        }

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                prevS[i] = st.peek();
            }
            st.push(i);
        }

        return prevS;
    }

    public int largestRectangleArea(int[] heights) {
        int[] prev = prevSmaller(heights);
        int[] next = nextSmaller(heights);

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = next[i] - prev[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}