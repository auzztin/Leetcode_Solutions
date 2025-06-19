class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int s=1;
        int [] d=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            d[i]=p;
            p*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            d[i]*=s;
            s*=nums[i];
            
        }
        return d;
    }
}
