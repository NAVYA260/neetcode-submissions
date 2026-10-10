class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, n = s.length(), start = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()<(i-start+1)) {
                char sh = s.charAt(start);
                map.put(sh,map.get(sh)-1);
                if(map.get(sh)==0) map.remove(sh);
                start++;
            }
            ans = Math.max(ans,map.size());
        }
        return ans;
    }
}
