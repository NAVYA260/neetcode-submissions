class Solution {
    private String generateCode(String s) {
        int[] freq = new int[26];
        for(char ch:s.toCharArray()) {
            freq[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++) {
            sb.append(freq[i]);
            sb.append('#');
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s:strs) {
            String code = generateCode(s);
            if(map.containsKey(code)) {
                map.get(code).add(s);
            }else{
                map.put(code,new ArrayList<>());
                map.get(code).add(s);
            }
        }
        for(String s:map.keySet()) {
            ans.add(map.get(s));
        }
        return ans;
    }
}
