class Solution {
    public int reverse(int x) {
        int rem=0;
        long sum=0;
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            x/=10;
        }
        if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE){
            return 0;
        }
        else{
        return (int) sum;
        }
    }
}