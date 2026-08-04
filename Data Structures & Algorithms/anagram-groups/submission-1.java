class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mapOne = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String word = new String(chars);
            if(mapOne.containsKey(word)) {
                List<String> list = mapOne.get(word);
                list.add(strs[i]);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                mapOne.put(word, list);
            }
        }
        return new ArrayList<>(mapOne.values());
    }
}
