class Solution {
    public  static void setZeroes(int[][] matrix) {
       int i,j;
       int m=matrix.length;
       int n=matrix[0].length;
       for(i=0;i<m;i++){
         for(j=0;j<n;j++){
            if(matrix[i][j]==0){
                markrow(i,n,matrix);
                markcol(j,m,matrix);
            }
         }
       }
       for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            if(matrix[i][j]==-10)
             matrix[i][j]=0;
        }
       }
       for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            System.out.print(matrix[i][j]);
        }
       }
    }

    public static void markrow(int i,int n,int[][] matrix){
        for(int j=0;j<n;j++){
            if(matrix[i][j]!=0)
             matrix[i][j]=-10;
        }
    }
     public static void markcol(int j,int m,int[][] matrix){
        for(int i=0;i<m;i++){
            if(matrix[i][j]!=0)
             matrix[i][j]=-10;
        }
    }
    
}