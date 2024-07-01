class Solution {
    public void rotate(int[] nums, int k) {
        // using manual reversing
        // forgot this at first, very important
        k = k%nums.length;

        // reverse entire array
        int i = 0;
        int j = nums.length-1;
        while(i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // reverse first k elements
        i = 0;
        j = k-1;
        while(i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        // reverse last n-k elements
        i = k;
        j = nums.length - 1;
        while(i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}