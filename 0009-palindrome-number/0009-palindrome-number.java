class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int rem=0;
        int rev=0;
        if(x==0){
            return true;
        }
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        if(dup==rev && dup>0){
            return true;
        }
        else{
            return false;
        }

    }
}