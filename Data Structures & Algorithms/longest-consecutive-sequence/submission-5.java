class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length,max_len = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(nums[i]);
        }
        for(int i=0;i<n;i++) {
            if(!set.contains(nums[i]-1)) {
                int c = 1,current = nums[i];
                while(set.contains(current+1)) {
                    c++;
                    current += 1;
                }
                max_len = Math.max(max_len,c);
            }
        }
        return max_len;
    }
}
