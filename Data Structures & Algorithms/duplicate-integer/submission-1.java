class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int item:nums) {
            if(!set.add(item)) return true;
        }
        return false;
    }
}