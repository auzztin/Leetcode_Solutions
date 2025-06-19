class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        if(num==6 || num==28 || num==496 || num==8128 || num==33550336){
            return true;
        }
        return false;
    }
}
