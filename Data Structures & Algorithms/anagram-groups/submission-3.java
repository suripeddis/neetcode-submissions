class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>(); 
        for(int i = 0; i < strs.length; i++) {
            List<String> words = new ArrayList<>();
            char[] chars = strs[i].toCharArray(); 
            Arrays.sort(chars); 
            String sorted = new String(chars); 
            if(!map.containsKey(sorted)) {
                words.add(strs[i]);
                map.put(sorted, words);
            }
            else {
               map.get(sorted).add(strs[i]);
            } 
        }
        return new ArrayList<>(map.values());
    }
}
