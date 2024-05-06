class Solution {
    public int climbStairs(int n) {
        // dp problem. could do it with recursion or tabulation, but since we only
        // need to remember the previous 2 steps, we can just use two variables

        if(n == 1) { return 1; }

        int prev = 1;
        int curr = 1;

        //1 taken care of, start at 2 and add until you get to n
        for(int i = 2; i <= n; i++) {
            // new = new-1 + new-2
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }

        return curr;
    }
}

// 2 ways to get to stair n - taking 1 step from stair n-1 or 2 steps from n-2
// therefore, 