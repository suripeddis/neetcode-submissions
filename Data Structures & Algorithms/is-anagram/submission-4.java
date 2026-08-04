class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapOne = new HashMap<>(); 
        HashMap<Character, Integer> mapTwo = new HashMap<>(); 
        
        for(int i = 0; i < s.length(); i++) {
            if (!mapOne.containsKey(s.charAt(i))) {
                mapOne.put(s.charAt(i), 1);
            }
            else {
                mapOne.put(s.charAt(i), mapOne.get(s.charAt(i)) + 1);
            }
        }

        for(int j = 0; j < t.length(); j++) {
            if(!mapTwo.containsKey(t.charAt(j))) {
                mapTwo.put(t.charAt(j), 1);
            }
            else {
                mapTwo.put(t.charAt(j), mapTwo.get(t.charAt(j)) + 1);
            }
        }

        if(mapOne.equals(mapTwo)) {
            return true;
        }
        else {
            return false;
        }
    }
}
