class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int[] indicies = new int[2];
        int indexOne = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                j = map.get(complement);
                indexOne = i;
            }
            map.put(nums[i], i);
        }
        indicies[0] = j;
        indicies[1] = indexOne;
        return indicies;
    }
}
