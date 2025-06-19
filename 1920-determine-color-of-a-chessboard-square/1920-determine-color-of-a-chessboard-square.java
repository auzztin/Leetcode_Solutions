class Solution {
    public boolean squareIsWhite(String c) {
        int str=Integer.parseInt(String.valueOf(c.charAt(1)));
        int n=(char)(c.charAt(0));
        int result=str+n;
        if(result%2==0){
            return false;
        }
        return true;
    }
}