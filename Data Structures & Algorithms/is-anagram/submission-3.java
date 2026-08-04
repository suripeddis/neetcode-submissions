class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapOne = new HashMap<>(); 
        HashMap<Character, Integer> mapTwo = new HashMap<>(); 
        if(s.length() != t.length()) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if(mapOne.containsKey(s.charAt(i))){
                int count = mapOne.get(s.charAt(i));
                count++;
                mapOne.put(s.charAt(i), count);
            }
            else {
                mapOne.put(s.charAt(i), 1);
            }
            if(mapTwo.containsKey(t.charAt(i))) {
                int count = mapTwo.get(t.charAt(i));
                count++;
                mapTwo.put(t.charAt(i), count);
            }
            else {
                mapTwo.put(t.charAt(i), 1);
            }
        }
        return mapOne.equals(mapTwo);
    }
}
