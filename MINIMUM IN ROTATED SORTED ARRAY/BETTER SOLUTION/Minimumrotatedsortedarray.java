//
arr=[3,4,5,1,2]
intialize l=0,r=n-1 and min to max MAX_VALUE
make mid as half of (l+r) and check the right half whether arr[m]<=arr[r] 
if yes update the min and decrement the r to m-1 in order to check left half else update the min to arr[l] and increment l to m+1       
in order to check right half.

**** TIME COMPLEXITY=O(log(n))
SPACE COMPLEXITY=O(1) ***

//


public class Minimumrotatedsortedarray {
    public static int findMin(int []arr) {
       int l=0,r=arr.length-1,m;
       int min=Integer.MAX_VALUE;
       while(l<=r){
           m=(l+r)/2;
           if(arr[m]<=arr[r]){
               if(arr[m]<min)
               min=arr[m];
               r=m-1;
           }
           else{
                if(arr[l]<min)
               min=arr[l];
               l=m+1;
           }
       }
       return min;
    }
}












