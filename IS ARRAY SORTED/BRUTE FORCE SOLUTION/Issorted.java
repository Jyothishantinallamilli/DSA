//
run two loops compare a[i] with every a[j], a[i] is less then retrun 0  else return 1

*** TIME COMPLEXITY=O(N^2)
    SPACE COMPLEXITY=O(1) ***

//
public class Issorted {
    public static int isSorted(int n, int []a) {
       for(int i=1;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(a[j]<=a[i])
               return 0;
           }
       }
       return 1;
    }
}