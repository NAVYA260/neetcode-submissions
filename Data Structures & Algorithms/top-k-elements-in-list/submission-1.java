class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int item:nums) {
            map.put(item,map.getOrDefault(item,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int item:map.keySet()) {
            pq.add(item);
        }
        int[] ans = new int[k];
        int i = 0;
        while(k>0) {
            ans[i] = pq.poll();
            i++;
            k--;
        }
        return ans;
    }
}
