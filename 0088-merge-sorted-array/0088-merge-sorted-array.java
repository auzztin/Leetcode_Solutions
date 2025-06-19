class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []arr=new int[m+n];
        for(int i=0;i<(m+n);i++){
            arr[i]=nums1[i];
        }
        int j=0;
        for(int i=m;i<(m+n);i++){
            arr[i]=nums2[j++];
        }
        Arrays.sort(arr);
        for(int i=0;i<(m+n);i++){
            nums1[i]=arr[i];
        }
    }
}