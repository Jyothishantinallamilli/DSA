//
take a i loop and check current element is less than previous element else return 0
we write return 1 at the ending because for loop should be completed to know if the array is sorted then if yes return 1


*** TIME COMPLEXITY=O(N)
    SPACE COMPLEXITY=O(1) ***
//


public class IsSorted {
    public static int isSorted(int n, int []a) {
       for(int i=1;i<n;i++){
           if(a[i]>=a[i-1]){
           }
           else 
          return 0;
       }
        return 1;
    }
}
