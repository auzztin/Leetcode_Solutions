class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int out=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != max && nums[max] < 2 * nums[i]) {
                return -1;
        }
    }
    return max;
  }
}