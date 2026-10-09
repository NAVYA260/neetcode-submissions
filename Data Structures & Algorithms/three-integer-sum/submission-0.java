class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = a.length,p=0;
        Arrays.sort(a);
        for(int i=0;i<m;i++) {
            if(i!=0 && a[i]==a[i-1]) continue;
            int j = i+1;
            int k = m-1;
            while(j<k) {
                int sum = a[i]+a[j]+a[k];
                if(sum>p) {
                    k--;
                    while(j<k && a[k]==a[k+1]){
                        k--;
                    }
                }
                else if(sum<p) {
                    j++;
                    while(j<k && a[j]==a[j-1]) {
                        j++;
                    }
                }
                else{
                    ans.add(new ArrayList<>(Arrays.asList(a[i],a[j],a[k])));
                    j++;
                    k--;
                    while (j < k && a[j] == a[j - 1]) j++;
                    while (j < k && a[k] == a[k + 1]) k--;
                }
            }
        }
        return ans;
    }
}
