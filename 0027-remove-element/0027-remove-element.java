class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}