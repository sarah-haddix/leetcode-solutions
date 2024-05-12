class Solution:
    def isPalindrome(self, x: int) -> bool:
        # Check for special cases
        if x < 0 or (x > 0 and x%10 == 0):
            return False

        result = 0
        # Reverse the second half of the integer and save it as result
        # Save only the first half of the integer in the original x variable
        while x > result:
            result = result * 10 + x % 10
            x = x // 10
        
        # Return True only if the first and reversed second half are equal
        return (x == result or x == result // 10) == True
        


##  handle special case len=1 first
## try to debunk palindrome as quickly as possible in a for loop, by working in from the outside. It'll catch the - scenario immediately.

## Reverse half of the number, during the process of taking each digit from the end to add to the "reversedHalf" number by continuously dividing the number by 10, we also reduce of the number of digits of the original number, when we check if the original number is > "reversedHalf", it means that we have reached the middle digit of the original number, we then check if the "reversedHalf" is the same as the "original number (now it just contains the first half of the digits)" or the "firstHalf" / 10 because the original number may contains odd number of digits so we can omit it

## In Python 3.x, 5 / 2 will return 2.5 and 5 // 2 will return 2. The former is floating point division, and the latter is floor division, sometimes also called integer division.