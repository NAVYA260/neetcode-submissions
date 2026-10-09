class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1 = new int[26];
        int[] s2 = new int[26];
        for(char ch:s.toCharArray()) {
            s1[ch-'a']++;
        }
        for(char ch:t.toCharArray()) {
            s2[ch-'a']++;
        }
        for(int i=0;i<26;i++) {
            if(s1[i]!=s2[i]) return false;
        }
        return true;
    }
}
