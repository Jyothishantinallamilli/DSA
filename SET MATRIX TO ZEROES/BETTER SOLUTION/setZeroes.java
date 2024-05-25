class Solution {
    public  static void setZeroes(int[][] matrix) {
       int i,j;
       int m=matrix.length;
       int n=matrix[0].length;
      int[] row=new int[m];
      int[] col=new int[n];
       for(i=0;i<m;i++){
         for(j=0;j<n;j++){
            if(matrix[i][j]==0){
                row[i]=1;
                col[j]=1;
            }
         }
       }
       for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            if(row[i]==1 || col[j]==1)
             matrix[i][j]=0;
        }
       }
       for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            System.out.print(matrix[i][j]);
        }
       }
    }
}