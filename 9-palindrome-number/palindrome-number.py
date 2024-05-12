class Solution:
    def isPalindrome(self, x):
        # Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
        if x < 0 or (x % 10 == 0 and x != 0):
            return False

        reversed_half = 0
        # Build the reverse of the second half of x
        while x > reversed_half:
            reversed_half = reversed_half * 10 + x % 10
            x //= 10

        # When the length of the number is odd, we can get rid of the middle digit by reversed_half // 10
        return x == reversed_half or x == reversed_half // 10