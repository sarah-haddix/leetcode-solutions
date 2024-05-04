class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // start - put everything into nums1
        // nums1 - m, nums2 - n
        
        m--;
        int i = m+n;
        n--;

        while(n >= 0 && i >= 0) {
            if(m >= 0) {
            if(nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
        } else {
            nums1[i] = nums2[n];
            n--;
        }
            i--;
        }
    }
}