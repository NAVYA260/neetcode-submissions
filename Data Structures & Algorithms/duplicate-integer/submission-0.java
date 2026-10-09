class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int item:nums) {
            if(set.contains(item)) return true;
            set.add(item);
        }
        return false;
    }
}