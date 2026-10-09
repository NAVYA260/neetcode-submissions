class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int item:map.keySet()) {
            q.add(new int[]{item,map.get(item)});
            if(q.size()>k) {
                q.poll();
            }
        }
        for(int i=0;i<k;i++) {
            ans[i] = q.poll()[0];
        }
        return ans;
    }
}
