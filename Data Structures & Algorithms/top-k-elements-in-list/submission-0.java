class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int[] result = new int[k];
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        Map.Entry<Integer, String>[] entryArray = map.entrySet().toArray(new Map.Entry[0]);
        Arrays.sort(entryArray, Map.Entry.comparingByValue());
        int length = entryArray.length;
        for(int i = 0; i < k; i++) {
            result[i] = entryArray[length - 1 - i].getKey();
        }
        return result;
    }
}
