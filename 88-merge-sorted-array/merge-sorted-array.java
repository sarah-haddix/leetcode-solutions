class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = n-1;
        int i = m-1;
        int f = m+n-1;
        while(j >= 0 && i >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[f] = nums1[i];
                f--;
                i--;
            }
            else {
                nums1[f] = nums2[j];
                f--;
                j--;
            }
        }

        while(j >= 0) {
            nums1[f] = nums2[j];
            f--;
            j--; 
        }
    }
}
// increasing
// nums1 - 1 2 5 6 _ _ _, m=4, i
// nums2 - 3 4 8, n=3, j