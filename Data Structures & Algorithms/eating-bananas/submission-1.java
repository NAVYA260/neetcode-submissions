class Solution {
    private int count(int[] piles, int f) {
        int s = 0;
        for(int i=0;i<piles.length;i++) {
            s+=Math.ceil((double)piles[i]/f);
        }
        return s;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            high = Math.max(high,piles[i]);
        }
        int ans = -1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            int find = count(piles,mid);
            if(find<=h) {
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}
