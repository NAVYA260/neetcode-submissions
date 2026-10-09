class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, c= 0;
        for(int item:nums) {
            if(item!=0) {
                prod*=item;
            }else{
                c++;
            }
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(c>1) {
                ans[i] = 0;
            }else if(c==1) {
                if(nums[i]!=0) ans[i] = 0;
                else ans[i] = prod;
            }else{
                ans[i] = prod/nums[i];
            }
        }
        return ans;
    }
}  
