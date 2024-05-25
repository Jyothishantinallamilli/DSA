class setZero {
    public  static void setZeroes(int[][] matrix) {
       int i,j;
       int m=matrix.length;
       int n=matrix[0].length;
      int col0=1;
       for(i=0;i<m;i++){
         for(j=0;j<n;j++){
            if(matrix[i][j]==0){
                matrix[i][0]=0;
                if(j>0){
                matrix[0][j]=0;
                }
                else{
                    col0=0;
                }
            }
         }
       }
       for(i=1;i<m;i++){
        for(j=1;j<n;j++){
            if(matrix[i][0]==0||matrix[0][j]==0)
            matrix[i][j]=0;
        }
       }
       for(j=0;j<n;j++){
        if(matrix[0][0]==0){
            matrix[0][j]=0;
        }
       }
       for(i=0;i<m;i++){
        if(col0==0){
            matrix[i][0]=0;
        }
       }
    for(i=0;i<m;i++){
        for(j=0;j<n;j++){
            System.out.print(matrix[i][j]);
        }
    }

    }
}