class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int ind=-1;
        int max=arr[n-1];
        int[]f=new int[max+1];
        for(int i=0;i<n;i++){
            f[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==f[arr[i]]){
                ind=arr[i];
            }
        }
        return ind;
    }
}