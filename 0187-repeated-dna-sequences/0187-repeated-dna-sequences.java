class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        int n = s.length();
        HashMap<String , Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();

        int i = 0;
        int j = 9;

        while(j<n) {
            map.merge(s.substring(i , i+10) , 1 , Integer::sum);
            i++;
            j++;
        }

        for(Map.Entry<String , Integer> entry : map.entrySet()) {
            if(entry.getValue() >= 2) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }
}