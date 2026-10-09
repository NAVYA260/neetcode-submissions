class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int p1 = 0,p2 = n-1;
        if(n==1) return true;
        while (p1 < p2) {
            while (p1 < p2 && !Character.isLetterOrDigit(s.charAt(p1))) {
                p1++;
            }
            while (p1 < p2 && !Character.isLetterOrDigit(s.charAt(p2))) {
                p2--;
            }
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
