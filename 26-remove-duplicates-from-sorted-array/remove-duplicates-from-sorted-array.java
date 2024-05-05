class Solution {
    public int removeDuplicates(int[] nums) {
        // idea: pointer i to keep track of where we are
        // pointer j that goes to the next valid element
        int j = 0;

        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[j];
            while(j <= nums.length) {
                if(j == nums.length) {
                    return i+1;
                }
                if(nums[j] == nums[i]) {
                    j++;
                } else {
                    break;
                }
            }
        }

        return nums.length;
    }
}