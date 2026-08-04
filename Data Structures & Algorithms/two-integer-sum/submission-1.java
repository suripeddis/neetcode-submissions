class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int j = map.get(complement);
                indices[0] = j;
                indices[1] = i;
                return indices;
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
