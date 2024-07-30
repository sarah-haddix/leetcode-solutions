class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words)); //Collections.reverse takes a list, use static Arrays method asList to turn words into list
        // type of words is still String[], Arrays.asList is backed by the original array so reversing the list reverses the array in place
        return String.join(" ", words);
    }
}

// using built-ins