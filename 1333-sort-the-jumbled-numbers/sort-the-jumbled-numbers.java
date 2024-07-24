import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        // Convert the int array to Integer array for using Arrays.sort with Comparator
        Integer[] numsInteger = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(numsInteger, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(convert(a, mapping), convert(b, mapping));
            }
        });

        // Convert the Integer array back to int array
        nums = Arrays.stream(numsInteger).mapToInt(Integer::intValue).toArray();
        return nums;
        /*
        mapping = [5, 6, 8, 7, 4, 0, 3, 1, 9, 2];
        convert(99, mapping);
        return new int[10];
        */
    }

    private int convert(int x, int[] mapping) {
        int num = x;
        int mappedNum = 0;
        int place = 1;
        // get each 1's digit of num, map it, add appropriate value to mappedNum
        while(place == 1 || num != 0) {
            mappedNum += place*mapping[num%10];
            place *= 10;
            num = (int)num/10;
        }
        return mappedNum;
    }
}

// 668, 007, 07
// can sort using comparitor or quicksort
// comparing condition: function to change it to the right number 
// could make it more time efficient/less space efficient with memoization