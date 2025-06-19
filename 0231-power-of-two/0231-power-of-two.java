class Solution {
    public boolean isPowerOfTwo(int n) {
        int pow=1;
        if(n<=0) return false;
        if((n&(n-1))==0) return true;
        return false;
    }
}