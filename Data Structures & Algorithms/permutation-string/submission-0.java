class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        if(n>m) return false;
        for(int i=0;i<n;i++) {
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        int c = 0;
        for(int i=0;i<26;i++) {
            if(freq1[i]==freq2[i]) c++;
        }
        if(c==26) return true;
        int s = 0;
        for(int i=n;i<m;i++) {
            freq2[s2.charAt(s)-'a']--;
            freq2[s2.charAt(i)-'a']++;
            c = 0;
            for(int j=0;j<26;j++) {
                if(freq1[j]==freq2[j]) c++;
            }
            if(c==26) return true;
            s++;
        }
        return false;
    }
}
