class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[]uni=Arrays.stream(nums).distinct().toArray();
        if(nums.length==uni.length) return false;
        else return true;
    }
}