// REVIEW SOLUTIONS TO SEE HOW TO HANDLE CHARCTERS - SOMETHING OTHER THAN ITERATING OVER STRING?
// BETTER WAY TO COMPARE PARENS?

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            if(c == '}' || c == ')' || c == ']') {
                if(stack.isEmpty()) { return false; }
                if(Math.abs(c - stack.pop()) > 2) { return false; }
            }
        }

        return stack.isEmpty();
    }
}

// (({}))
// (({

// do this process until entire string is processed. if stack is empty at the end then return true. can return false during execution
// push parenthesis onto stack one at a time
// if encounter closing parenthesis, pop matching parentehsis from stack. if none exists, return false
