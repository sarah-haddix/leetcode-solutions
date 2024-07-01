class Solution {
    public void rotate(int[] nums, int k) {
        // forgot this at first, very important
        k = k%nums.length;

        // reverse entire array
        reverse(nums, 0, nums.length-1);

        // reverse first k elements
        reverse(nums, 0, k-1);

        // reverse last n-k elements
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int i, int j) {
        while(i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}