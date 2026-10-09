class Solution {
    
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, slash));
            i = slash + 1;
            ans.add(str.substring(i, i + length));
            i += length;
        }
        return ans;
    }
}
