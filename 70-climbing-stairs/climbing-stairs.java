class Solution {
    public int climbStairs(int n) {
        if(n == 1) { return 1; } //take care of stair 1

        int prevStep = 1; 
        int currStep = 1; 

        for(int i = 2; i <= n; i++) { // i = 2 refers to stair 2
            int temp = currStep;
            currStep = currStep + prevStep;
            prevStep = temp;
        }

        return currStep;
    }
}

// similar to fs
// 2 ways to get to where you are, from n-1 or n-2
// bottom up dp approach
// find ways to get to 