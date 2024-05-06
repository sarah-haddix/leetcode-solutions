class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(true) {
            slow = findSquareNums(slow);
            fast = findSquareNums(findSquareNums(fast));

            if(fast == 1 || slow == 1) {
                return true;
            }

            if(fast == slow) { break; }
        }

        return slow == 1;
    }

    public int findSquareNums(int n) {
        int sum = 0;

        while(n > 0) {
            int place = n %10;
            sum += (place*place);
            n = (int)(n / 10);
        }

        return sum;
    }
}