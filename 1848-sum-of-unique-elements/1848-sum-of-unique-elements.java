class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=nums[n-1];
        int[]f=new int[max+1];
        for(int i=0;i<n;i++){
            f[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if((f[nums[i]])<=1){
                sum+=nums[i];
            }
        }
        return sum;
    }
}