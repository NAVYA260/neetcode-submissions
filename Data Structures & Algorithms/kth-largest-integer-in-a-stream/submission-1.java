class KthLargest {
    int p;
    PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        p = k;
        pq = new PriorityQueue<>();
        for(int item:nums) {
            pq.add(item);
            if(pq.size()>p) pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>p) {
            pq.poll();
        }
        //System.out.println(pq.peek());
        return pq.peek();
    }
}
