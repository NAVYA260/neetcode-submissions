class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new LinkedList<>();
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int idx = 0;
        for(int i=0;i<k;i++) {
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]) {
                q.pollLast();
            }
            q.addLast(i);
        }
        ans[idx++] = nums[q.peekFirst()];
        for(int i=k;i<n;i++) {
            while(!q.isEmpty() && q.peekFirst()<=(i-k)) {
                q.pollFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]) {
                q.pollLast();
            }
            q.addLast(i);
            ans[idx++] = nums[q.peekFirst()];
        }
        return ans;
    }
}
