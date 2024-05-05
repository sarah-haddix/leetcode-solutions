class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        boolean duplicated = false;

        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                duplicated = false;
            }

            else if(nums[j] == nums[i] && !duplicated) {
                duplicated = true;
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
}