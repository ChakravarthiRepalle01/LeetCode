class Solution {
    public String frequencySort(String s) {
        int n = s.length();

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i<n ; i++) {
            map.merge(s.charAt(i) , 1 , Integer::sum);
        }

        List<Map.Entry<Character , Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        StringBuilder finalAns = new StringBuilder();

        for(Map.Entry<Character , Integer> entry : list) {
            char c = entry.getKey();
            int freq = entry.getValue();
            for(int i = 0 ; i<freq ; i++) {
                finalAns.append(c);
            }
        }

        return finalAns.toString();
    }
}