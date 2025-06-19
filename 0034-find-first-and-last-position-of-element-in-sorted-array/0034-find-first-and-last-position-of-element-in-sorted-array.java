class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ind=-1;
        int indd=-1;
        for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    ind=i;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
                if(nums[i]==target){
                    indd=i;
            }
        }
        return new int[]{indd,ind};
    }
}