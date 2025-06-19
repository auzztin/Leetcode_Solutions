class Solution {
    public int strStr(String h, String n) {
        for(int i=0;i<h.length();i++){
            if(h.contains(n)){
                return h.indexOf(n);
            }
        }
        return -1;
    }
}