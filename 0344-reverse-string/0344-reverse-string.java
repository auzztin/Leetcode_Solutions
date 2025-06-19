class Solution {
    public void reverseString(char[] s) {
    //    for(int i=s.length;i>=0;i--){
    //         a[i]=s[i];
    //    } 
    //    return a;
    int start=0;
    int end=s.length-1;
    
    while(start<end){
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
    }
    
    }
}