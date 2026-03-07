class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offerLast(i);

            if (queue.peekFirst() == i - k) {
                queue.pollFirst();
            }

            if (i >= k - 1) {
                result[index] = nums[queue.peekFirst()];
                index++;
            }

        }

        return result;
    }
}
