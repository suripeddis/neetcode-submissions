class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int[] output = new int[k];
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i]) + 1); 
            }
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a, b) -> a.getValue() - b.getValue());

        for(int i = entries.size() - 1; i >= entries.size()-k; i--) {
            if(j >= k) {
                break;
            }
            output[j] = entries.get(i).getKey();
            j++;
        }
        return output;
    }
}
