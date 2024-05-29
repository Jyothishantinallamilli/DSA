//
here the array contains duplicate elements everything is same as search in rotated sorted array we just add 
if the lth element and mth element and rth elemnent are same then increment l and decrement r and the continue
we written continue because the next lth element may also contain mth element. here there will be shrinkage of search space.
we just return true or false whether the key element is found or not

*** TIME COMPLEXITY=O(log2n)
    AVG TIME COMPLEXITY=O(n/2) if the array contains too many duplicate elements
    SPACE COMPLEXITY=O(1) ***
//



public class Searchinrotatedsortedarray {
    public static boolean searchInARotatedSortedArrayII(int []A, int key) {
         int l=0,r=A.length-1,m;
        while(l<=r){
            m=(l+r)/2;
            if(A[m]==key){
                 return true;
            }
           else if(A[m]==A[l]&&A[m]==A[r]){
                l=l+1;
                r=r-1;
                continue;
            }
            else{
                if(A[m]<=A[r]){
                    if(A[m]<key && A[r]>=key){
                        l=m+1;
                    }
                    else{
                        r=m-1;
                    }
                }
                else{
                        if(A[m]>key && A[l]<=key){
                        r=m-1;
                        }
                    else{
                        l=m+1;
                    }
                    }
                }
            }
            return false;
    }
}