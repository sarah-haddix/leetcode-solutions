import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();

        // Convert the int array to Integer array for using Arrays.sort with Comparator
        Integer[] numsInteger = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(numsInteger, (a, b) -> {
                return Integer.compare(convert(a, mapping, seen), convert(b, mapping, seen));
        });

        // Convert the Integer array back to int array
        nums = Arrays.stream(numsInteger).mapToInt(Integer::intValue).toArray();
        return nums;
    }

    private int convert(int x, int[] mapping, HashMap<Integer, Integer> seen) {
        if(seen.containsKey(x)) { return seen.get(x); }
        int num = x;
        int mappedNum = 0;
        int place = 1;
        // get each 1's digit of num, map it, add appropriate value to mappedNum
        while(place == 1 || num != 0) {
            mappedNum += place*mapping[num%10];
            place *= 10;
            num = (int)num/10;
        }

        seen.put(x, mappedNum);
        return mappedNum;
    }
}

// 668, 007, 07
// can sort using comparitor or quicksort
// comparing condition: function to change it to the right number 
// could make it more time efficient/less space efficient with memoization