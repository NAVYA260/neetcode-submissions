class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int c = 0, n = s.length(), start = 0, ans = 0;
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            c = Math.max(c,map.get(ch));
            while((i-start+1)-c>k) {
                char sh = s.charAt(start);
                map.put(sh,map.get(sh)-1);
                start++;
            }
            ans = Math.max(ans,i-start+1);
        }
        return ans;
    }
}
