class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=n*2;
        int[] arr=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int j=0;
        for(int i=n;i<m;i++){
            arr[i]=nums[j++];
        }
        return(arr);
    }
}