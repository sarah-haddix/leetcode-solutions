class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> C = new ArrayList<Integer>();

        int[] A; 
        int[] B;

        if(nums1.length < nums2.length) { A = nums1; B = nums2; }
        else { A = nums2; B = nums1; }

        // Sort A first - implement merge sort after this passes
        Arrays.sort(A);

        for(int i = 0; i < B.length; i++) {
            boolean found = binarySearch(0, A.length-1, A, B[i]);
            if(found && !C.contains(B[i])) { C.add(B[i]); }
        }

        int[] arrayC = new int[C.size()];
        for(int i = 0; i < C.size(); i++) {
            arrayC[i] = C.get(i);
        }

        return arrayC;
    }

    boolean binarySearch(int start, int end, int[] arr, int target) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) { return true; }

            if(arr[mid] < target) { start = mid + 1; }

            else { end = mid - 1; }
        }
        return false;
    }
}