class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0; 
        int r = numbers.length-1; 

        int currSum = 0; 

        while(l < r) {
            currSum = numbers[l] + numbers[r];

            if(currSum > target) {
                r--;
            }
            else if(currSum < target) {
                l++;
            }
            else {
                int[] answer = {l+1, r+1}; 
                return answer;
            }
        }
        return new int[0];
    }
}
