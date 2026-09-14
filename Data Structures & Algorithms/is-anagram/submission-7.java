class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapOne = new HashMap<>(); 
        HashMap<Character, Integer> mapTwo = new HashMap<>(); 

        for(char a: s.toCharArray()) {
            if(!mapOne.containsKey(a)) {
                mapOne.put(a, 1);
            }
            else {
                mapOne.put(a, mapOne.get(a) + 1);
            }
        }

        for(char b: t.toCharArray()) {
            if(!mapTwo.containsKey(b)) {
                mapTwo.put(b,1);
            }
            else {
                mapTwo.put(b, mapTwo.get(b) + 1);
            }
        }

        if(mapOne.equals(mapTwo)) {
            return true;
        }
        return false;
    }
}
