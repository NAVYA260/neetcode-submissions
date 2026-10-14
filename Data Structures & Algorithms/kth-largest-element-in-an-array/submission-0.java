class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int item:nums) {
            pq.add(item);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }
}
