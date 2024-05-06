class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) {
            return 0;
        }

        // arr[i] is min # of coins to get to i amount
        int[] memo = new int[amount+1];
        for(int i = 0; i < memo.length; i++) {
            memo[i] = -1; //-1 means not feasible
        }

        memo[0] = 0; // memo: 0, -1, 1, -1
        for(int i = 1; i < amount+1; i++) { //i=3
            for(int coin = 0; coin < coins.length; coin++) {
                int subproblem = i - coins[coin]; //subproblem = 1
                if(subproblem >= 0) {
                    if(!(memo[i] == -1 && memo[subproblem] == -1)) {
                    if(memo[i] == -1) { memo[i] = memo[subproblem] + 1; }
                    else if(memo[subproblem] == -1) {}
                    else {memo[i] = Math.min(memo[i], memo[subproblem] + 1); }
                    }
                }
            }
        }

        return memo[amount];
    }
}