class Solution {
    public int[] sortByBits(int[] arr) {
        //bubble sort with additional conditions
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length-1; i++){
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++){
                int num1 = numberOfOnes(arr[j]);
                int num2 = numberOfOnes(arr[j+1]);
                if((num1 > num2) || ((num1 == num2) && arr[j] > arr[j+1])){
                    //swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            //if no elements were swapped by inner loop, then break
            if(!swapped)
                break;
        }
        return arr;
    }

    //takes decimal integer, returns the number of ones in the binary representation
    public int numberOfOnes(int num){
        //modify comp211 code, just ++ counter instead of creating a new string
        int counter = 0;
        while(num > 0){
            if(num%2 == 1)
                counter++;
            num /= 2;
        }
        return counter;
    }
}