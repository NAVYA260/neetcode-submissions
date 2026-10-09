class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs) {
            int[] freq = new int[26];
            for(char ch:s.toCharArray()) {
                freq[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++) {
                sb.append(freq[i]).append("#");
            }
            String key = sb.toString();
            if(map.containsKey(key)) {
                map.get(key).add(s);
            }else{
                map.put(key,new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
