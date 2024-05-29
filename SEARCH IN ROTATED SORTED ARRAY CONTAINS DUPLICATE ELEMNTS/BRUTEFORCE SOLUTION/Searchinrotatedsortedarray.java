//
its a linear search approach where we comapre every elemnt with target if yes return true
  if there is no such target found in the array the return false

  *** TIME COMPLEXITY=O(n)
      SPACE COMPLEXITY=O(1) ***
//




public class Searchinrotatedsortedarray {
    public static boolean searchInARotatedSortedArrayII(int []A, int key) {
        for(int i=0;i<A.length;i++){
            if(A[i]==key)
            return true;
        }
            return false;
    }
}