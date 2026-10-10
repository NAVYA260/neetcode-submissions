class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "");
        int p1 = 0, p2 = s.length()-1;
        while(p1<=p2) {
            if(!Character.isLetter(s.charAt(p1)) && !Character.isDigit(s.charAt(p1))) p1++;
            if(!Character.isLetter(s.charAt(p2)) && !Character.isDigit(s.charAt(p2))) p2--;
            else {
                if(s.charAt(p1)!=s.charAt(p2)) {
                    return false;
                }else{
                    p1++;
                    p2--;
                }
            }
        }
        return true;
    }
}
