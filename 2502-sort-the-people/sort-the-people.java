class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        quickSort(names, heights, 0, heights.length-1);
        return names;
    }

    private void quickSort(String[] names, int[] arr, int start, int end) {
        if(start >= end) { return; }

        int j = start;
        int i = start - 1;
        int pivot = end;
        int temp = 0;
        String tempName = "";

        while(j < pivot) {
            if(arr[j] > arr[pivot]) {
                i++; // i always points to last number smaller than arr[pivot]
                // swap arr[i] and arr[j]
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // swap corresponding names
                tempName = names[i];
                names[i] = names[j];
                names[j] = tempName;
            }
            j++;
        }
        // at this point all values to the left of i inclusive are less than pivot
        // swap pivot into the right place
        i++;
        temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
        // swap corresponding names
        tempName = names[i];
        names[i] = names[j];
        names[j] = tempName;

        quickSort(names, arr, start, i-1);
        quickSort(names, arr, i+1, end);
    }
}
// biggest height first
// just sort heights and make the same switches to names as you go
// use quicksort

// option 2:
// hashmap. idk maybe.