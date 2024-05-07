class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // maxAverage equal to finding maxSum -> don't have to divide every time
        // use sliding window approach
        // calculate maxSum for first k numbers
        // have pointer for start and end of window
        // calculate sum for each interval by subtracting nums[start], start++, adding nums[end], end++, do while end < nums.length

        int start = 0;
        int end = k-1; //points to actual element you should be ending on
        int maxSum = 0;

        for(int i = 0; i <= end; i++) {
            maxSum += nums[i];
        }

        end++; //end now points to the next thing to add to the sum
        int prevSum = maxSum;

        while(end < nums.length) {
            int currSum =  prevSum - nums[start] + nums[end];
            if(currSum > maxSum) { maxSum = currSum; }
            start++; end++;
            prevSum = currSum;
        }

        return (double)maxSum/k;
    }
}