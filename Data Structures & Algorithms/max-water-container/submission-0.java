class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int p1 = 0, p2 = n-1;
        int ans = Integer.MIN_VALUE;
        while(p1<p2) {
            int min = Math.min(heights[p1],heights[p2]);
            ans = Math.max(ans,min*(p2-p1));
            if(heights[p1]<heights[p2]) {
                p1++;
            }else if(heights[p1]>heights[p2]) {
                p2--;
            }else{
                p1++;
                p2--;
            }
        }
        return ans;
    }
}
