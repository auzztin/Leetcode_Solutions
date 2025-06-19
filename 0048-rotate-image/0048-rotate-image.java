class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int [][]arr=new int[n][n];
      for(int i=0;i<n;i++){
        int m=0;
        for(int j=n-1;j>=0;j--){
            arr[i][m++]=matrix[j][i];
        }
      } 
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix[i][j]=arr[i][j];
        }
      }
    }
}